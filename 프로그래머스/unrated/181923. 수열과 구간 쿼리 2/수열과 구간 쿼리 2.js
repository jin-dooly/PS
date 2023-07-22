function solution(arr, queries) {
    var answer = [];
    for(var n=0; n<queries.length; n++){
        var s = queries[n][0];
        var e = queries[n][1];
        var k = queries[n][2];
        var find = [];
        for(var i=s; i<=e; i++){
            if(arr[i] > k){
                find.push(arr[i]);
            }
        }
        answer.push(find.length ? Math.min(...find) : -1);
    }
    
    return answer;
}