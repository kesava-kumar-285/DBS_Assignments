interface student_interface{
	assign_data(id:number,name:string,stream:string):void;
	//display():void;
	get_Id();
	get_Name();
	get_Stream();
	
	}
	
class student implements student_interface{
	private id:number;
	private name:string;
	private stream:string;
	
	assign_data(id:number,name:string,stream:string):void{
		this.id=id;
		this.name=name;
		this.stream=stream;
	}
	get_Id(){
		return this.id;
	};
	get_Name(){
		return this.name;
	};
	get_Stream(){
		return this.stream;
	};

}
var student_obj = new student();
student_obj.assign_data(88,"Kesava","CSE");
console.log ("ID : "+student_obj.get_Id() +"\nName : "+student_obj.get_Name()+"\nStream : "+student_obj.get_Stream());
