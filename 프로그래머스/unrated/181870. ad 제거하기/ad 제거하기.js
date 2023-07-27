function solution(strArr) {
    var answer = [];
    strArr.map((e) => {
        if(e.indexOf("ad")<0){
            answer.push(e);
        }
    })
    return answer;
}