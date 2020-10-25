import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Practise';
  
  imageURL:string ="../assets/waterfall.jpg";

  // 2 nd ques
  x:number =80;
  y:number =100;
  
  // 3rd ques
  number1 :number =80;
  number2 :number =100;


  first_name: string ="Kesava"
  last_name: string ="Kumar";


  OnButtonClicked(Server){
    console.log("OK OK Well Done !!!!");
    alert("OK OK Well Done !!!!");
  }

  first_name1: string ="Kesava"
  last_name1: string ="Kumar"

  getname(){
    alert(this.first_name1+" "+this.last_name1);
  }

  basic: number = 8800000
  HRA: number = 800;
  DA: number = 800;
  deductions: number =800
  IT: number = 900;
  gross_salary: number =this.basic+this.HRA+this.DA+this.deductions+this.IT
  net_salary:number = this.gross_salary - (this.deductions+this.IT)

  
  getdetails(){
    
    alert("My Salary : "+this.net_salary);
  }

  request:string ="disabled"

  months = ["Januay","Febraury","March","April","May","June","July","August","September","October","November","December"];
  h1color:string ='blue';
  changeColor()
  {
    this.h1color='yellow'; 
  }


  pipe_data:string ="Pipe data";

  
  upper_case: string ="Kesava"
  lower_case: string ="Kumar"
  currency 
  todaynumber: number = Date.now();
  jsonVal =""
  percentage =0.88

}
