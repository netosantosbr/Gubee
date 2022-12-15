import { Component } from '@angular/core';
import { Router } from '@angular/router'
import { Hero } from 'src/app/components/heroi/heroi.model';
import { HeroiService } from 'src/app/components/heroi/heroi.service';
import { HeaderService } from 'src/app/components/template/header/header.service';

@Component({
  selector: 'app-heroi-crud',
  templateUrl: './heroi-crud.component.html',
  styleUrls: ['./heroi-crud.component.css']
})
export class HeroiCrudComponent {
  
  firstId: string = '';
  secondId: string = '';

  constructor(private router: Router,
              private headerService: HeaderService,
              private heroiService: HeroiService){
    headerService.headerData = {
      title: 'Painel de Controle de Heróis',
      icon: 'sports_martial_arts',
      routeUrl: '/herois'
    }
  }
  isVisibleSearchTable: boolean = false;
  isVisibleTrueTable: boolean = true;
  searchedValue: string = '';
  searchType: string = 'ID';
  heroes: Hero[] = [];
  singleHero: Hero[] = [];
  displayedColumns = ['id', 'name', 'race', 'strength', 'agility', 'dexterity', 'intelligence', 'action']

  ngOnInit(): void {

  }

  navigateToHeroCreate(): void {
    this.router.navigate(['/herois/create'])
  }

  navigateToHeroComparison(): void {
    this.router.navigate([`/herois/compare/${this.firstId}/${this.secondId}`])
  }

  search(): void {
    switch(this.searchType) {
      case 'ID':
        this.heroiService.readById(this.searchedValue).subscribe(hero => {
          this.singleHero.push(hero);         
          this.heroes = this.singleHero;
          this.isVisibleSearchTable = true;
          this.isVisibleTrueTable = false;
        });
        break;
      case 'NAME':
        this.heroiService.readByName(this.searchedValue).subscribe(heroes => {
          this.heroes = heroes;
          this.isVisibleSearchTable = true;
          this.isVisibleTrueTable = false;
        });
        break;
      default:
        break;
    }
    
  }

  eraseSearch(): void {
    this.isVisibleSearchTable = false;
    this.isVisibleTrueTable = true;
  }
}
