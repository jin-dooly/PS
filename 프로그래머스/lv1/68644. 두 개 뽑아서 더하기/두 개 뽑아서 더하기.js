function solution(numbers) {
    var answer = new Set();
    numbers.forEach((n, idx) => {
        for(var i=idx+1; i<numbers.length; i++) {
            answer.add(n+numbers[i]);
        }
    })
    return [...answer].sort((a,b) => a-b);
}