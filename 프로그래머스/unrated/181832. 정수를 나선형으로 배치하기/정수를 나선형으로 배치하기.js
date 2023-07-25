function solution(n) {
    var answer = Array.from(Array(n), () => new Array(n).fill(-1));
    var x=0;
    var y=0;
    var dir='e';
    var i=1;
    while(i<=n*n){
        answer[y][x] = i++;
        if(dir=='e'){
            if(x+1 >=n || answer[y][x+1]!= -1) {
                dir='s'; 
                y++;
            }
            else x++;
        }else if(dir=='s'){
            if(y+1 >=n || answer[y+1][x]!= -1) {
                dir='w';
                x--;
            }
            else y++;
        }else if(dir=='w'){
            if(x-1 <0 || answer[y][x-1]!= -1) {
                dir='n';
                y--;
            }
            else x--;
        }else if(dir=='n'){
            if(y-1 <0 || answer[y-1][x]!= -1) {
                dir='e';
                x++;
            }
            else y--;
        }
    }
    return answer;
}