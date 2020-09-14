var Customer = /** @class */ (function () {
    function Customer(fName, lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    Customer.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer.prototype.setFirstName = function (val) {
        this.firstName = val;
    };
    Object.defineProperty(Customer.prototype, "age", {
        // With different syntax : Accessors
        get: function () {
            return this.age;
        },
        set: function (val1) {
            this.age = val1;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
var myCustomer = new Customer("T", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);
myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());
// console.log("Age is : ", myCustomer.age);
myCustomer.age = 30;
console.log("Age is : ", myCustomer.age);
