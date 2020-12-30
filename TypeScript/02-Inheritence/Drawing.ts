import {Shape} from './Shape';
import {Circle} from './Circle';
import { Rectangle } from './Rectangle';

let myShape = new Shape(10, 20);
console.log(myShape.getInfo());

let myCircle = new Circle(15, 25, 5);
console.log(myCircle.getInfo());

let myRectangle = new Rectangle(0, 0, 3, 4);
console.log(myRectangle.getInfo());