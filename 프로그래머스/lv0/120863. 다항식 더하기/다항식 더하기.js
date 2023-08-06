function solution(polynomial) {
    var x = 0;
    var constant = 0;
    polynomial.split(/ \+ /g).map(e => {
        if(e == 'x') {
            x++;
        }
        else if(e.includes('x')){
            x += Number(e.replace('x',""));
        }
        else{
            constant += Number(e);
        }
    })
    if(x==0) return constant.toString();
    if(x==1) x='';
    if(constant==0) return x+"x";
    return x+"x + "+constant;
}