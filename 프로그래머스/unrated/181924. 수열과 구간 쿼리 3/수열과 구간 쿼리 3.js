function solution(arr, queries) {
    var answer = arr;
    for(var idx=0; idx<queries.length; idx++){
        var i=queries[idx][0];
        var j=queries[idx][1];
        var tmp = answer[i];
        answer[i] = answer[j];
        answer[j] = tmp;
    }
    return answer;
}