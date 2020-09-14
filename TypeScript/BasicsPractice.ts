console.log("Hello Brother....")

/**
 * Variables 
 */
let found: boolean = true;
let grade: number = 80;
let cname: string = "ABC";
let anyVar: any = "21nal";

console.log(found, grade, cname, anyVar);

/**
 * Template Strings 
 */
let firstName: string = "Anil";
let secondName: string = "Kumar";
console.log(`Hi ${firstName} ${secondName}`);

/**
 * For loop
 */
for(let i=0; i<=5; i++){
    console.log(i);
}
// Foreach....
let sports: string[] = ["Cricket", "Golf", "Badminton"];
sports.forEach(element => {
    console.log(element)
});