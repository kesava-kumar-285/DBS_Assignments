function even(n) {
    var a = n;
    var n = 1;
    while (a != 1) {
        n = n * a;
        a--;
    }
    console.log(n);
}
even(10);
