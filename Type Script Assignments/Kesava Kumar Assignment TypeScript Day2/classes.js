var myclass = /** @class */ (function () {
    //constructor() { console.log ("This id constructor");}
    function myclass(data) {
        this.myData = 30;
        this.myData = data;
    }
    myclass.prototype.returnData = function () { return this.myData; };
    return myclass;
}());
//var myClassObj =new myclass;
//console.log("Class data :" +myClassObj.returnData());
var myClassObj1 = new myclass(20);
console.log("Class data :" + myClassObj1.returnData());
