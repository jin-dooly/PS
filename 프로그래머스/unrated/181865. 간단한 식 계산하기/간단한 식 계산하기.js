function solution(binomial) {
    var answer = 0;
    var arr = binomial.split(' ');
    var a = Number(arr[0]);
    var b = Number(arr[2]);
    var op = {
        "+" : a+b,
        "-" : a-b,
        "*" : a*b
    };
    return op[arr[1]];
}