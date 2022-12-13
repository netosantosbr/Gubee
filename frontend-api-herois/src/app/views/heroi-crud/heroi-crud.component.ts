import { Component } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-heroi-crud',
  templateUrl: './heroi-crud.component.html',
  styleUrls: ['./heroi-crud.component.css']
})
export class HeroiCrudComponent {
  constructor(private router: Router){}

  ngOnInit(): void {}

  navigateToHeroCreate(): void {
    this.router.navigate(['/herois/create'])
  }
}
