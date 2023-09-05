function solution(number) {
    var answer = 0;
    number.sort((a,b) => a-b)
    for(var i=0; number[i]<=0; i++){
        for(var j=i+1; j<number.length-1; j++){
            var n = -1*(number[i]+number[j]);
            for(var k=j+1; k<number.length; k++){
                if(n === number[k]) answer++;
            }
            //console.log(n, answer);
        }
    }
    return answer;
}