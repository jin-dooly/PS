function solution(num_str) {
    var answer = 0;
    num_str.split("").map((e) => {
        answer += Number(e);
    })
    return answer;
}