function solution(n) {
    return func(n-1);
}

function func(n) {
    // console.log(n);
    for(var i = Math.floor(n/2); i>1; i--) {
        if(n%i === 0) return func(n/i);
    }
    return n;
}