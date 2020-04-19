import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable, of } from "rxjs";
import { catchError } from "rxjs/operators";
import { Stock } from "./stock";

@Injectable()
export class StockService {

  private readonly baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/stock';
  }

  public list(): Observable<Stock[]> {
    const url = `${this.baseUrl}/list`;
    return this.http.get<Stock[]>(url);
  }

  public quote(symbol: string): Observable<Stock> {
    const url = `${this.baseUrl}/quote/${symbol}`;
    return this.http.get<Stock>(url).pipe(
      catchError(this.handleError<Stock>(`stock quote symbol = ${symbol}`))
    );
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

}
