function solution(babbling) {
    var answer = 0;
    for(var i=0; i<babbling.length; i++){
        var str = babbling[i].replaceAll('aya', 1).replaceAll('ye', 2).replaceAll('woo',3).replaceAll('ma',4)
        console.log(str);
        if(!/[a-z]/.test(str) && str.length) {
            if(!str.includes('11')&&!str.includes('22')&&!str.includes('33')&&!str.includes('44')) answer++;
        }
    }
    return answer;
}