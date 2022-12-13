import { Component } from '@angular/core';
import { HeroiService } from '../heroi.service';
import { Router } from '@angular/router'
import { Hero } from '../heroi.model';

@Component({
  selector: 'app-heroi-create',
  templateUrl: './heroi-create.component.html',
  styleUrls: ['./heroi-create.component.css']
})
export class HeroiCreateComponent {

  hero: Hero = {
    name:'',
    race:'',
  }

  constructor(private heroiService: HeroiService, private router: Router) {}

  ngOnInit(): void {}

  createHero(): void {
    this.heroiService.create(this.hero).subscribe(() => {
      this.heroiService.showMessage('Herói criado com sucesso!');
      this.router.navigate(['/herois'])
      console.log(`${this.hero.name} and ${this.hero.race} `);
    })
  }

  cancel(): void {
    this.router.navigate(['/herois'])
  }
}
