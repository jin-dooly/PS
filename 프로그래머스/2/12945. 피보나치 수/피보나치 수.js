

function solution(n) {
    let fiboNum = [0, 1];

    for(let i=2; i<=n; i++) {
        fiboNum[i] = (fiboNum[i-1] + fiboNum[i-2]) % 1234567
    }
    
    
    return fiboNum[n];
}
