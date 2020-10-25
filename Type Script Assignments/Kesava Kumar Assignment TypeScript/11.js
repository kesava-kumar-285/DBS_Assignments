function determine(n1) {
    if (n1 > 0)
        return "positive";
    else if (n1 < 0)
        return "negative";
    else
        return "zero";
}
console.log("The Given Number is : " + determine(80));
