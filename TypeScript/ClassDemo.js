"use strict";
var Customer = /** @class */ (function () {
    function Customer(fName, lName, age) {
        this.firstName = fName;
        this.lastName = lName;
        this._age = age;
    }
    Customer.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer.prototype.setFirstName = function (val) {
        this.firstName = val;
    };
    Object.defineProperty(Customer.prototype, "age", {
        get: function () {
            return this._age;
        },
        set: function (value) {
            this._age = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
var myCustomer = new Customer("T", "Anil", 30);
console.log(myCustomer.firstName, myCustomer.lastName);
myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());
console.log(myCustomer.age);
