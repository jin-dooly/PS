function solution(dots) {
    function line(a, b){
        return (dots[a][1]-dots[b][1])/(dots[a][0] - dots[b][0])
    }
    for([a,b,c,d] of [[0,1,2,3],[0,2,1,3],[0,3,1,2]]){
        if(line(a,b)===line(c,d)) return 1;
    }
    return 0;
}

