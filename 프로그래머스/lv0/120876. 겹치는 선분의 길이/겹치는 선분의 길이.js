function solution(lines) {
    var answer = new Set();
    var all = new Set();
    lines.map((line) => {
        for(var i=line[0]; i<line[1]; i++){
            if(all.has(i)){
                answer.add(i);
            }
            all.add(i);
        }
    })
    return answer.size;
}