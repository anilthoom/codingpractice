"use strict";
/**
 * Parameters properties demo..for removing boilar plate code.
 */
var Customers = /** @class */ (function () {
    function Customers(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    Object.defineProperty(Customers.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customers.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customers;
}());
var myCustomers = new Customers("Thoom", "Anil");
console.log(myCustomers.firstName);
