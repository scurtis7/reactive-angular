import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from "./about/about.component";
import { MainComponent } from "./main/main.component";
import { SearchComponent } from "./search/search.component";
import { SigninComponent } from "./signin/signin.component";

const routes: Routes = [
  { path: 'about', component: AboutComponent },
  { path: 'main', component: MainComponent },
  { path: 'search', component: SearchComponent },
  { path: 'signin', component: SigninComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
