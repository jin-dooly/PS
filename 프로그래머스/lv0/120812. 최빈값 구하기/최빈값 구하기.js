function solution(array) {
    var value = [0];
    var answer = 0;
    var cnt = {};
    for(e of array){
        if(cnt[e]==null) cnt[e] = 1;
        else cnt[e]++;
    }
    for(key in cnt){
        if(cnt[key] >= value[0]) {
            value.push(cnt[key]);
            value.sort((a,b) => b-a);
            answer = key;
        }
    }
    return value[0]>value[1] ? Number(answer) : -1;
}