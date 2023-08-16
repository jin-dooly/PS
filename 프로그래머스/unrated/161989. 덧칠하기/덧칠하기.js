function solution(n, m, section) {
    var answer = 0;
    for(var i=0; i<section.length; i++) {
        answer++;
        let start = section[i];
        while(i < section.length-1 && start+m-1 >= section[i+1]) {
            i++;
        }
    }
    return answer;
}