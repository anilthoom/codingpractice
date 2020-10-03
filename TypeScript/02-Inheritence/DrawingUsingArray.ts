import {Shape} from './Shape';
import {Circle} from './Circle';
import { Rectangle } from './Rectangle';

let myShape = new Shape(10, 20);
let myCircle = new Circle(15, 25, 5);
let myRectangle = new Rectangle(0, 0, 3, 4);

//Empty array of type Shape
let theShapes: Shape[] = [];