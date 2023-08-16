function solution(wallpaper) {
    var answer = [50, 50, 0, 0];
    for(var i=0; i<wallpaper.length; i++){
        let tmp = wallpaper[i].indexOf('#');
        if(tmp == -1) continue;
        answer[0] = Math.min(answer[0], i);
        answer[1] = Math.min(answer[1], tmp);
        
        tmp = wallpaper[i].lastIndexOf('#');
        answer[2] = Math.max(answer[2], i+1);
        answer[3] = Math.max(answer[3], tmp+1);
    }
    return answer;
}