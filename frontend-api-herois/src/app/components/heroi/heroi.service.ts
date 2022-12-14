import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { HttpClient } from '@angular/common/http'
import { Hero } from './heroi.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HeroiService {

  baseUrl = "http://localhost:8080/api/v1/heroes"

  constructor(private snackBar: MatSnackBar, private http: HttpClient) {}

  showMessage(msg: string): void {
    this.snackBar.open(msg, 'X', {
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top"
    })
  }

  create(hero: Hero): Observable<Hero> {
    return this.http.post<Hero>(this.baseUrl, hero);
  }

  readAll(): Observable<Hero[]> {
    return this.http.get<Hero[]>(`${this.baseUrl}/findAll`);
  }

  readById(id: string): Observable<Hero> {
    return this.http.get<Hero>(`${this.baseUrl}/${id}`);
  }

  update(hero: Hero): Observable<Hero> {
    const updateUrl = `${this.baseUrl}/${hero.id}`;
    return this.http.put<Hero>(updateUrl, hero);
  }

  delete(id: string): Observable<Hero> {
    const deleteUrl = `${this.baseUrl}/${id}`;
    return this.http.delete<Hero>(deleteUrl);
  }
}
