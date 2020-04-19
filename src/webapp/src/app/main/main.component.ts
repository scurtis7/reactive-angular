import { Component, OnInit } from '@angular/core';
import { Stock } from "../stock";
import { StockService } from "../stock.service";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  stocks: Stock[] = [];

  constructor(private stockService: StockService) {
  }

  ngOnInit(): void {
    this.stocks = [
      { 'symbol': 'AAPL', 'name': 'Apple', 'description': 'Apple Incorporated' },
      { 'symbol': 'MA', 'name': 'Mastercard', 'description': 'Mastercard Incorporated' },
      { 'symbol': 'NFLX', 'name': 'Netflix', 'description': 'Netflix Incorporated' },
      { 'symbol': 'PAYC', 'name': 'Paycom', 'description': 'Paycom Incorporated' }
    ];
    // this.stockService.list()
    //   .subscribe(results => this.stocks = results);
  }

  getQuote(symbol: string) {
    console.log(symbol);
    this.stockService.quote(symbol)
      .subscribe(result => {
        return result;
      })
  }

}
