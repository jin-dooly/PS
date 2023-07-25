function solution(num_list) {
    var answer = 0;
    if(num_list.length>=11){
        num_list.map((e) => {answer+=e});
    }else{
        answer++;
        num_list.map((e) => {answer*=e});
    }
    return answer;
}