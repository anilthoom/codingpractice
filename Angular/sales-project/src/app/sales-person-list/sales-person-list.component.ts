import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-bootstrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  salesPersonList: SalesPerson[] = [
    new SalesPerson("Anil", "Kumar", "anil@abc.com", 50000),
    new SalesPerson("Ramya", "V", "ramya@abc.com", 60000),
    new SalesPerson("Shrihan", "Chandra", "shrihan@abc.com", 40000),
    new SalesPerson("Shritha", "T", "shritha@abc.com", 90000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
