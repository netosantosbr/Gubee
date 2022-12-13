import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './views/home/home.component'
import { HeroiCrudComponent } from './views/heroi-crud/heroi-crud.component'
import { HeroiCreateComponent } from './components/heroi/heroi-create/heroi-create.component' 


const routes: Routes = [{
  path: "",
  component: HomeComponent
}, {
  path: "herois",
  component: HeroiCrudComponent
}, {
  path: "herois/create",
  component: HeroiCreateComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
