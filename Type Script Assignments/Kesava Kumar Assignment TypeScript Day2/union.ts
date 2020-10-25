var data;

data =20;

console.log("Variable as number :"+ data);

data="This is a string";

console.log("Variable as string :"+ data);

function dataType ( data:number | string):void
{
	if(typeof data =="string")
		console.log("String data");
	else if(typeof data =="number")
		console.log("Data is number");
}

dataType(80);
dataType("This is string");