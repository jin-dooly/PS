function solution(rank, attendance) {
    var answer = [];
    for(var i=0; i<rank.length; i++){
        if(attendance[i]){
            answer.push({ num : i, ran : rank[i]});
        }
    }
    answer.sort((a,b) => a.ran-b.ran);
    return answer[0].num*10000 + answer[1].num*100 + answer[2].num;
}