function solution(arr, queries) {
    var answer = arr;
    queries.map(([s,e,k]) => {
        for(var i=s; i<=e; i++){
            if(i%k===0){
                answer[i]++;
            }
        }
    })
    return answer;
}