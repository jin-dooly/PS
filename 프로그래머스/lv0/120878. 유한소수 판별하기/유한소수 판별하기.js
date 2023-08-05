function solution(a, b) {
    var answer = 0;
    var b_prime = [];
    while(b>1){
        for(var i=2; i<=b; i++){
            if(b%i===0){
                b = Math.floor(b/i);
                b_prime.push(i);
                break;
            }
        }
    }
    b_prime.map((p, i) => {
        if(a%p===0){
            b_prime[i] = 2;
            a = Math.floor(a/p);
        }
    })
    return b_prime.join("").replace(/2|5/g, "")==="" ? 1 : 2;
}