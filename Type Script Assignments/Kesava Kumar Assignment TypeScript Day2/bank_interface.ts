export interface IBank
{
	assign_data(acct_no:number, name:string, balance:number) : void;
	get_Acct_no();
	get_Name();
	get_Balance();

}