var global_var: number = 20;

class myclass
{
	local_var: number =50;
	static static_var : number =60;
	
	local_data() : number
	{
		var local_var : number =10;
		return local_var;
		}
}

console.log("Global variable : "+global_var);
console.log("Static variable : "+myclass.static_var);
var myclassObj=new myclass();
console.log("Class variable " + myclassObj.local_var);
console.log("Local variable data "+myclassObj.local_data());

	