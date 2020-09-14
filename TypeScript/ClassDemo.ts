class Customer{
    firstName: string;
    lastName: string;
    
    constructor(fName: string, lName: string){
        this.firstName = fName;
        this.lastName =  lName;
    }

    public getFirstName(): string{
        return this.firstName;
    }
    public setFirstName(val: string): void{
        this.firstName = val;
    }
}

let myCustomer = new Customer("T", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);

myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());