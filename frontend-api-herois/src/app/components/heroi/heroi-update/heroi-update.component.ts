import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hero } from '../heroi.model';
import { HeroiService } from '../heroi.service';

@Component({
  selector: 'app-heroi-update',
  templateUrl: './heroi-update.component.html',
  styleUrls: ['./heroi-update.component.css']
})
export class HeroiUpdateComponent {
  
  hero: Hero = {
    name:'',
    race:'',
  }

  constructor(
    private heroiService: HeroiService, 
    private router: Router,
    private route: ActivatedRoute) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    const finalId = (id == null) ? '' : id;
    this.heroiService.readById(finalId).subscribe(hero => {
      this.hero = hero;
    })
  }

  updateHero(): void {
    this.heroiService.update(this.hero).subscribe(() => {
      this.heroiService.showMessage('Herói atualizado com sucesso!');
      this.router.navigate(['/herois']);
    })
  }

  cancel(): void {
    this.router.navigate(['/herois']);
  }
}
