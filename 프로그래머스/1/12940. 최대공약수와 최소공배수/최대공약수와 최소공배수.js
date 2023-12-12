function solution(n, m) {
    let min = Math.min(n, m);
    let max = Math.max(n, m);
    
    if(max%min === 0) return [min, max]
    
    for(var i=min; i>0 ; i--) {
        if(max%i===0 && min%i===0) return [i, min * (max/i)]
    }
}