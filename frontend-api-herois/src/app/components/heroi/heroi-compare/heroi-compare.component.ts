import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HeroCompare } from '../heroi-compare.model';
import { Hero } from '../heroi.model';
import { HeroiService } from '../heroi.service';

@Component({
  selector: 'app-heroi-compare',
  templateUrl: './heroi-compare.component.html',
  styleUrls: ['./heroi-compare.component.css']
})
export class HeroiCompareComponent {

  firstHero: Hero = {
    name: '',
    race: ''
  }

  secondHero: Hero = {
    name: '',
    race: ''
  }

  heroCompare: HeroCompare = {
    first_hero_id: '',
    second_hero_id: '',
    strength_difference: 0,
    agility_difference: 0,
    dexterity_difference: 0,
    intelligence_difference: 0 
  }



  constructor(private activatedRoute: ActivatedRoute,
              private route: Router,
              private heroiService: HeroiService) {}

  ngOnInit(): void {
    const firstId = this.activatedRoute.snapshot.paramMap.get('id');
    const secondId = this.activatedRoute.snapshot.paramMap.get('id2');
    const finalFirstId = (firstId == null) ? '' : firstId;
    const finalSecondId = (secondId == null) ? '' : secondId;

    this.heroiService.readById(finalFirstId).subscribe(firstHero => {
      this.firstHero = firstHero;
    });

    this.heroiService.readById(finalSecondId).subscribe(secondHero => {
      this.secondHero = secondHero;
    });

    this.heroiService.compare(finalFirstId, finalSecondId).subscribe(heroCompare => {
      this.heroCompare = heroCompare
    });

    console.log(`${this.heroCompare.first_hero_id} + ${this.heroCompare.second_hero_id} + ${this.heroCompare.strength_difference}`)
  }

  finalizarComparacao(): void {
    this.route.navigate(['/herois']);
  }
}
