function solution(keymap, targets) {
    var answer = [];
    let key = {};
    
    for(str of keymap){
        for(var i=0; i<str.length; i++){
            let ch = str[i];
            if(key[ch] == null) key[ch] = i+1;
            else key[ch] = Math.min(key[ch], i+1);
        }
    }
    
    targets.forEach(target => {
        var sum = 0;
        for(var i=0; i<target.length; i++) {
            let ch = target[i];
            if(key[ch] == null){
                sum = -1;
                break;
            }
            sum += key[ch];
        }
        answer.push(sum);
    })
    return answer;
}