"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Shape_1 = require("./Shape");
var Circle_1 = require("./Circle");
var myShape = new Shape_1.Shape(10, 20);
console.log(myShape.getInfo());
var myCircle = new Circle_1.Circle(15, 25, 5);
console.log(myCircle.getInfo());
