function fibonacci(n) {
    var x = 2;
    var a = 0;
    var b = 1;
    console.log(a);
    console.log(b);
    var c;
    while (x != n) {
        c = a + b;
        a = b;
        b = c;
        console.log(c);
        x++;
    }
}
fibonacci(11);
