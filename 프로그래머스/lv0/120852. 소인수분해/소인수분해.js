function solution(n) {
    var answer = new Set();
    while(n > 1) {
        for(var i=2; i<=n; i++){
            if(n%i === 0){
                answer.add(i);
                n/=i;
                break;
            }
        }
    }
    return [...answer];
}