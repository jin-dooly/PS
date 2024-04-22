function solution(people, limit) {
    var answer = 0;
    people.sort((a, b) => a - b);
    while(people.length) {
        if(people.length>1 && people[0]+people[people.length-1] <= limit) {
            people.shift();
            people.pop();
        }else {
            people.pop();
        }
        answer++;
    }
    return answer;
}