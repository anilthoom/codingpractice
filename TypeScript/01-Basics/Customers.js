"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CustomersClass = void 0;
/**
 * Parameters properties demo..for removing boilar plate code.
 */
var CustomersClass = /** @class */ (function () {
    function CustomersClass(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    Object.defineProperty(CustomersClass.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(CustomersClass.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    return CustomersClass;
}());
exports.CustomersClass = CustomersClass;
