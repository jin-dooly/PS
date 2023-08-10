function solution(balls, share) {
    return Math.floor(fac(share+1, balls) / (fac(2, balls-share)*fac(share)));
}

function fac(s, e) {
    var value=1;
    for(var i=s; i<=e; i++){
        value*=i;
    }
    return value;
}