import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hero } from '../heroi.model';
import { HeroiService } from '../heroi.service';

@Component({
  selector: 'app-heroi-delete',
  templateUrl: './heroi-delete.component.html',
  styleUrls: ['./heroi-delete.component.css']
})
export class HeroiDeleteComponent {
  
  hero: Hero = {
    name: '',
    race: ''
  };

  constructor(private heroiService: HeroiService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.paramMap.get('id');
    const finalId = (id == null) ? '' : id;

    this.heroiService.readById(finalId).subscribe(hero => {
      this.hero = hero
    })
  }

  deleteHero(): void {
    const id = (this.hero.id == null) ? '' : this.hero.id;

    this.heroiService.delete(id).subscribe(() => {
      this.heroiService.showMessage('Herói deletado com sucesso!');
      this.router.navigate(['/herois']);
    });
  }

  cancel(): void {
    this.router.navigate(['/herois']);
  }
}
