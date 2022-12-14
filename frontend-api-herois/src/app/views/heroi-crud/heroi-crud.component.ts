import { Component } from '@angular/core';
import { Router } from '@angular/router'
import { HeaderService } from 'src/app/components/template/header/header.service';

@Component({
  selector: 'app-heroi-crud',
  templateUrl: './heroi-crud.component.html',
  styleUrls: ['./heroi-crud.component.css']
})
export class HeroiCrudComponent {
  constructor(private router: Router,
              private headerService: HeaderService){
    headerService.headerData = {
      title: 'Painel de Controle de Heróis',
      icon: 'sports_martial_arts',
      routeUrl: '/herois'
    }
  }

  ngOnInit(): void {}

  navigateToHeroCreate(): void {
    this.router.navigate(['/herois/create'])
  }
}
