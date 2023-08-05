function solution(n) {
    for(var i=3; i<=n; i++){
        if(i%3==0 || i.toString().indexOf(3)!=-1){
            n++;
        }
    }
    return n;
}