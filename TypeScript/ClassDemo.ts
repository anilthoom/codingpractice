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
    public get age(): number {
        return this._age;
    }
    public set age(value: number) {
        this._age = value;
    }
 }

let myCustomer = new Customer("T", "Anil", 30);
console.log(myCustomer.firstName, myCustomer.lastName);

myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());
console.log(myCustomer.getFirstName(), myCustomer.age);