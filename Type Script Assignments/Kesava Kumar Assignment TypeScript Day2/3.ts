var n:number =2;

var a:number=0;
var b:number=1;

console.log(a);
console.log(b);

var c:number;
while(n!=11){
	c=a+b;
	a=b;
	b=c;
	console.log(c);
	n++;
	}