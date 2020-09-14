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

    private _age: number;
    // With different syntax : Accessors
    public get age(): number{
        return this.age;
    }
    public set age(val1: number){
        this.age = val1;
    }
}

let myCustomer = new Customer("T", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);

myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());

// console.log("Age is : ", myCustomer.age);
myCustomer.age = 30;
console.log("Age is : ", myCustomer.age);