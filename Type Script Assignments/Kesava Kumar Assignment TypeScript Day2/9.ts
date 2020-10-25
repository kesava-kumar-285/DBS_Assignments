class Employee
{
  id: number;
  name: string;
  dept:string;
  designation : string;
  
  display(): void
  {
     console.log ("ID: " + this.id + "    Name : "+this.name + "    Dept : "+ this.dept + "    Designation : "+this.designation);
  } }
class regular_employee extends Employee
{
   salary : number;
   
   constructor (id:number, name : string, dept: string, designation : string, salary: number)
   {  
     super();   
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.designation = designation;
	this.salary = salary;
   }
   
   display(): void
   {
      super.display();
	  console.log ("Salary : " + this.salary);
   }
}

class contract_employee extends Employee {
	time_of_contract: number;
	constructor (id:number, name : string, dept: string, designation : string,time_of_contract: number)
	{
		super();   
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.designation = designation;
	this.time_of_contract= time_of_contract;
	}
	display(): void
   {
      super.display();
	  console.log ("time_of_contract : " + this.time_of_contract);
   }
   }



var regular_employeeObj = new regular_employee(80, "Chetan", "CSE" , "Project Manager", 8800000);

regular_employeeObj.display();
var contract_employeeObj = new contract_employee(80, "Chandra", "CSE" , "Project Manager", 8);

contract_employeeObj.display(); 





























                                                                                       