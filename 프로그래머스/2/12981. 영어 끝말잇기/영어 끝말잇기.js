function solution(n, words) {
    for(let i=0; i < words.length; i++) {
        let cur = words[i];
        let pre = words[i-1];
        
        if((i!==0 && cur.charAt(0) !== pre.charAt(pre.length-1)) || (i !== words.indexOf(cur)) || (cur.length <= 1)) {
            return [i%n+1, Math.floor(i/n+1)];
        }
    }

    return [0, 0];
}