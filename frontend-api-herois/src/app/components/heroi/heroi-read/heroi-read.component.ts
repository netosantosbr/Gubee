import { Component } from '@angular/core';
import { Hero } from '../heroi.model';
import { HeroiService } from '../heroi.service';

@Component({
  selector: 'app-heroi-read',
  templateUrl: './heroi-read.component.html',
  styleUrls: ['./heroi-read.component.css']
})
export class HeroiReadComponent {
  
  heroes: Hero[] = [];
  displayedColumns = ['id', 'name', 'race', 'strength', 'agility', 'dexterity', 'intelligence', 'action']

  constructor(private heroiService: HeroiService) {}

  ngOnInit() {
    this.heroiService.readAll().subscribe(heroes => {
      this.heroes = heroes;
      console.log(heroes);
    })
  }
}
