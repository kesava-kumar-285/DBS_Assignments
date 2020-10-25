import { Component, OnInit,OnDestroy,ViewChild } from '@angular/core';
import { MyserviceService } from './myservice.service';
import { detail } from './shared/details.model';
import { NgForm } from '@angular/forms';
import { Subscription} from 'rxjs';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  @ViewChild('f') slForm:NgForm;
  subscription: Subscription;
  editMode=false;
  editeddetailIndex:number;
  editeddetail:detail;
  title = 'angular-day2';
  today;
  dated:string="";
  time;
  d;
  sum;
  sub;
  mult;
  div;
  rem;
  imageUrl="../assets/time.jpg"
  // number1:number;
  // number2:number;
  result:number;
  constructor(private myservice :MyserviceService){}

  ngOnInit(){
    this.today=this.myservice.showDate();
    this.d =this.myservice.showTime();
    this.sum =this.myservice.getsum();
    this.sub =this.myservice.getsub();
    this.mult =this.myservice.getmult();
    this.div =this.myservice.getdiv();
    this.rem =this.myservice.getrem();
    // this.subscription=this.myservice.statedEditing
    //   .subcribe(
    //     (index: number) => {
    //       this.editeddetailIndex=index;
    //       this.editMode=true;
    //       this.editeddetail=this.myservice.getdetail(index);
    //       this.slForm.setValue({
    //         id:this.editeddetail.id,
    //         fitstname:this.editeddetail.firstname,
    //         lastname:this.editeddetail.lastname,
    //         email:this.editeddetail.email

    //       })
    //     }
    //   );

    

  }

  getDate(){
    this.time=this.myservice.showDate();
    return this.imageUrl;
  }
  getTime(){
    this.time=this.myservice.showTime();
  }
  getDateFormate(){
    this.time=this.myservice.showDate_Formate();
  }

  sum1:any;
  num1:number=80;
  num2:number=100;

  onAdd(){
    this.sum1=this.myservice.onAddition(Number(this.num1),Number(this.num2));
    alert("The sum is : "+this.sum1);
  }
  onSub(){
    this.sum1=this.myservice.onSubtraction(Number(this.num1),Number(this.num2));
    alert("The Differnce is : "+this.sum1);
  }
  onMul(){
    this.sum1=this.myservice.onMultiplication(Number(this.num1),Number(this.num2));
    alert("The Product is : "+this.sum1);
  }
  onDiv(){
    this.sum1=this.myservice.onDivision(Number(this.num1),Number(this.num2));
    alert("The Quotient is : "+this.sum1);
  }
  onRem(){
    this.sum1=this.myservice.onRemainder(Number(this.num1),Number(this.num2));
    alert("The Remainder is : "+this.sum1);
  }

  
  Message : string ="OK OK Enough of Playing, Come Home !!!!";

  childToParentStr:string;
  MessageFromChild(e){
   this.childToParentStr=e;
   alert("Message from child to parent is "+this.childToParentStr);
  }

  details: detail[]=[

    new detail(10,"Chandra","kiran","ck@gmail.com"),
    new detail(11,"Rishika","reddy","rr@gmail.com"),
    new detail(12,"Sai","Teja","st@gmail.com"),
    new detail(13,"Suresh","krishna","sk@gmail.com")

  ];
  id:number;
  firstname:string;
  lastname:string;
  email:string;

  onAdddetails(form: NgForm){
    const value = form.value;
    this.id=form.value.id;
    this.firstname=form.value.firstname;
    this.lastname=form.value.lastname;
    this.email=form.value.email;
    const newdetail = new detail(value.id,value.firstname,value.lastname,value.email);
    this.details.push(newdetail);  
  }

  onDelete(){
    this.details=this.details.slice(0,this.details.length-1);

  }
  onEdit(form:NgForm){
    let index=form.value.id;
    for(let i=1;i<this.details.length;i++){
      if(i==index){
        this.details.slice(i,1);
      }
    }

  }


//   isButtonTitleClicked: Array<boolean>;
//   buttonData;
//   onButtonTitleClicked(): void {
//     this.buttonData = [{
//       title: "Prediction",
//       description: "text",
//       img: "../../assets/time.jpg"
//   }];
// }
  

 


  

}




