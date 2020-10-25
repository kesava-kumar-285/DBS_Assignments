"use strict";
exports.__esModule = true;
var Bank = /** @class */ (function () {
    function Bank() {
    }
    Bank.prototype.assign_data = function (acct_no, name, balance) {
        this.acct_no = acct_no;
        this.name = name;
        this.balance = balance;
    };
    Bank.prototype.get_Acct_no = function () {
        return this.acct_no;
    };
    ;
    Bank.prototype.get_Name = function () {
        return this.name;
    };
    ;
    Bank.prototype.get_Balance = function () {
        return this.balance;
    };
    ;
    return Bank;
}());
var bankObj = new Bank();
bankObj.assign_data(88, "Chandra", 8800000);
console.log("Account number : " + bankObj.get_Acct_no() + "\nName: " + bankObj.get_Name() + "\nBalance : " + bankObj.get_Balance());
