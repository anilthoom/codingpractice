"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customers_1 = require("./Customers");
var myObj = new Customers_1.Customers("Thoom", "Shri Tharunika");
console.log(myObj.firstName);
console.log(myObj.lastName);
var newObj = new Customers_1.Customers("Thoom", "Shrihan Chandra");
console.log(newObj.firstName);
console.log(newObj.lastName);
