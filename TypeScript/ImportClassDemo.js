"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customers_1 = require("./Customers");
var myObj = new Customers_1.Customers("T", "Shri Tharunika");
console.log(myObj.firstName);
console.log(myObj.lastName);
var newObj = new Customers_1.Customers("T", "Shrihan Chandra");
console.log(newObj.firstName);
console.log(newObj.lastName);
