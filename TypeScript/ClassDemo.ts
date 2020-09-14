class Customer{
    firstName: string;
    lastName: string;
    
    constructor(fName: string, lName: string, age: number){
        this.firstName = fName;
        this.lastName =  lName;
        this._age = age;
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

let myCustomer = new Customer("T", "Anil", 30);
console.log(myCustomer.firstName, myCustomer.lastName);

myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());



console.log(myCustomer.age);