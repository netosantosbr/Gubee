import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './views/home/home.component';
import { HeroiCrudComponent } from './views/heroi-crud/heroi-crud.component';
import { HeroiCreateComponent } from './components/heroi/heroi-create/heroi-create.component' ;
import { HeroiUpdateComponent } from './components/heroi/heroi-update/heroi-update.component';
import { HeroiDeleteComponent } from './components/heroi/heroi-delete/heroi-delete.component';
import { HeroiCompareComponent } from './components/heroi/heroi-compare/heroi-compare.component';

const routes: Routes = [{
  path: "",
  component: HomeComponent
}, {
  path: "herois",
  component: HeroiCrudComponent
}, {
  path: "herois/create",
  component: HeroiCreateComponent
}, {
  path: "herois/update/:id",
  component: HeroiUpdateComponent
}, {
  path: "herois/delete/:id",
  component: HeroiDeleteComponent
}, {
  path: "herois/compare/:id/:id2",
  component: HeroiCompareComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
