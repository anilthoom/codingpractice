import {Shape} from './Shape';
import {Circle} from './Circle';
import { Rectangle } from './Rectangle';

let myCircle = new Circle(15, 25, 5);
let myRectangle = new Rectangle(0, 0, 3, 4);

//Empty array of type Shape
let theShapes: Shape[] = [];

theShapes.push(myCircle);
theShapes.push(myRectangle);

for(let tempShape of theShapes){
    console.log(tempShape.getInfo());
    console.log(tempShape.calculateArea());
    console.log();
}