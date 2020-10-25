class myclass
{
	myData : number =30;

//constructor() { console.log ("This id constructor");}

constructor(data: number){this.myData=data;}
returnData():number
{ return this.myData;}
}
//var myClassObj =new myclass;
//console.log("Class data :" +myClassObj.returnData());

var myClassObj1 =new myclass(20);
console.log("Class data :" +myClassObj1.returnData());

