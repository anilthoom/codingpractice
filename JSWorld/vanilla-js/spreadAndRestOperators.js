const numbers = [1, 2, 3, 4];
const newNumbers = [...numbers, 5, 6, 7]; //Spread and assign on arrays
console.log(newNumbers)

// Spread and assign on objects
const person = {
  name: 'Anil'
}
const newPerson = {
  ...person,
  age: 24
}

//Rest
const filter = (...args) => {
    return args.filter(el => el === 1);
  }
  
  console.log(filter(2, 1, 5, 6, 1, 4, 5))