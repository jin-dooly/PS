function solution(s) {
    var answer = "";
    var cnt = new Array(26).fill(0);
    for(var i=0; i<s.length; i++){
        cnt[s.charCodeAt(i)-97]++;
    }
    for(var i=0;  i<26; i++){
        if(cnt[i]===1) answer += String.fromCharCode(i+97);
    }
    return answer;
}