class Customer{
    firstName: string;
    lastName: string;
    
    constructor(fName: string, lName: string){
        this.firstName = fName;
        this.lastName =  lName;
    }
}

let myCustomer = new Customer("Thoom", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);