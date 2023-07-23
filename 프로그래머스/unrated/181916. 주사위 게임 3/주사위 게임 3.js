function solution(a, b, c, d) {
    var answer = 0;
    var [a,b,c,d] = [a,b,c,d].sort();
    console.log(a,b,c,d);
    //모두 같을 때
    if(a==d){
        return a*1111;
    }
    //셋만 같을 때
    if(a==c){
        return (10 * a + d)**2;
    }else if(b==d){
        return (10 * d + a)**2;
    }
    //둘둘
    if((a==b&&c==d)){
        return (a+d) * Math.abs(a-d);
    }
    //둘만 같을 때
    if(a==b){
        return c * d;
    }else if(b==c){
        return a * d;
    }else if(c==d){
        return a * b;
    }
    //다 다를 때
    return Math.min(a,b,c,d);
}