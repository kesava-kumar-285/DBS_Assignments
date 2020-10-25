function fibonacci(n:number){
var x:number =2;

var a:number=0;
var b:number=1;

console.log(a);
console.log(b);

var c:number;
while(x!=n){
	c=a+b;
	a=b;
	b=c;
	console.log(c);
	x++;
	}
	}
fibonacci(11);