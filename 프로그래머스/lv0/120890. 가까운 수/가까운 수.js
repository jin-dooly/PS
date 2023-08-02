function solution(array, n) {
    var answer = array.sort((a,b) => {
        if(Math.abs(n-a) !== Math.abs(n-b)) return Math.abs(n-a) - Math.abs(n-b);
        else return a-b;
    });
    return answer[0];
}