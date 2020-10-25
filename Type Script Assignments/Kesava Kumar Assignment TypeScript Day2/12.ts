interface IBank
{
	assign_data(acct_no:number, name:string, balance:number) : void;
	get_Acct_no();
	get_Name();
	get_Balance();

}

class Bank implements IBank{

	private acct_no:number;
	private name:string;
	private balance : number;
  
	assign_data(acct_no:number, name:string, balance:number) : void
  {
	this.acct_no= acct_no;
	this.name = name;
	this.balance= balance;
  }
	get_Acct_no(){
		return this.acct_no;
	};
	get_Name(){
		return this.name;
	};
	get_Balance(){
		return this.balance;
	};

}

var bankObj = new Bank();
bankObj.assign_data(88,"Chandra",8800000);
console.log ("Account number : " + bankObj.get_Acct_no() + "\nName: "+ bankObj.get_Name()+ "\nBalance : " + bankObj.get_Balance());
