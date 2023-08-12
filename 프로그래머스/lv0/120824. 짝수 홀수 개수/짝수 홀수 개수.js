function solution(num_list) {
    var answer = [0, 0];
    for(e of num_list){
        if(e%2===0) answer[0]++;
        else answer[1]++;
    }
    return answer;
}