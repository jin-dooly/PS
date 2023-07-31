function solution(num, total) {
    var answer = [];
    var middle = total/num;
    if(num%2==0){
        for(var i=0; i<num/2; i++){
            answer.unshift(Math.floor(middle)-i);
            answer.push(Math.ceil(middle)+i);
        }
    }else{
        answer.push(middle);
        for(var i=1; i<num/2; i++){
            answer.unshift(middle-i);
            answer.push(middle+i);
        }
    }
    return answer;
}