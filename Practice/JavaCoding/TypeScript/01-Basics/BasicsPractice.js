"use strict";
console.log("Hello Brother....");
/**
 * Variables
 */
var found = true;
var grade = 80;
var cname = "ABC";
var anyVar = "21nal";
console.log(found, grade, cname, anyVar);
/**
 * Template Strings
 */
var firstName = "Anil";
var secondName = "Kumar";
console.log("Hi " + firstName + " " + secondName);
/**
 * For loop
 */
for (var i = 0; i <= 5; i++) {
    console.log(i);
}
//Simplified for loop
var grades = [40, 20, 32, 88];
for (var _i = 0, grades_1 = grades; _i < grades_1.length; _i++) {
    var grade_1 = grades_1[_i];
    console.log(grade_1);
}
// Foreach....
var sports = ["Cricket", "Golf", "Badminton"];
sports.forEach(function (element) {
    console.log(element);
});
