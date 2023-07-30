function solution(picture, k) {
    var answer = [];
    for(n of picture){
        var str = '';
        for(var l=0; l<n.length; l++){
            for(j=0; j<k; j++) str += n[l];
        }
        for(j=0; j<k; j++){
            answer.push(str);
        }
    }
    return answer;
}