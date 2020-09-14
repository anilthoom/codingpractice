var Customer = /** @class */ (function () {
    function Customer(fName, lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    return Customer;
}());
var myCustomer = new Customer("Thoom", "Anil");
console.log(myCustomer.firstName, myCustomer.lastName);
