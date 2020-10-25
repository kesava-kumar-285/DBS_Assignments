var n = 0;
for (var i = 2; i < 30; i++) {
    var h = false;
    for (var j = 2; j <= i / 2; ++j) {
        if (i % j == 0) {
            h = true;
            break;
        }
    }
    if (h == false) {
        console.log(i);
        n++;
    }
    if (n == 10) {
        break;
    }
}
