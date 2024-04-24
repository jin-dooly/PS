function solution(elements) {
    var answer = {};
    elements.forEach((e, idx) => {
        let sum = 0;
        for(let i=0; i<elements.length; i++) {
            sum += elements[(i+idx)%elements.length];
            answer[sum] = sum;
        }
    })
    return Object.values(answer).length;
}