function solution(n) {
    var answer = '';
    do{
        answer = (n%3 || '4') + answer;
        n = Math.floor((n-1)/3);
    }while(n/3)
    return answer;
}