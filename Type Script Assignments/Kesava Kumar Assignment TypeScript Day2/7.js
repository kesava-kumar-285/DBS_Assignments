var value;
value = 88;
value = "abacadaadacaba";
var x = false;
for (var i = 0; i <= value.length / 2; i++) {
    if (value[i] != value[value.length - i - 1]) {
        x = true;
    }
}
if (x == false) {
    console.log("It is a Palindrome");
}
else {
    console.log("It is not a palindrome");
}
if (typeof value == "string") {
    console.log("String");
}
value = 30;
if (typeof value == "number") {
    console.log("Number");
}
