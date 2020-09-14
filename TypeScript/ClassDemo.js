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
    return Customer;
}());
var myCustomer = new Customer("T", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);
myCustomer.setFirstName("Thoom");
console.log(myCustomer.getFirstName());
