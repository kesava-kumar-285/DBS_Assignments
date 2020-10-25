var n = 2;
var a = 0;
var b = 1;
console.log(a);
console.log(b);
var c;
while (n != 11) {
    c = a + b;
    a = b;
    b = c;
    console.log(c);
    n++;
}
