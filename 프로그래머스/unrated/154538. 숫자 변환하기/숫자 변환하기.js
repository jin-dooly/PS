function solution(x, y, n) {
    if(x === y) return 0;
    var answer = 0;
    var queue = [y];
    while (queue.length) {
        var len = queue.length
        console.log(queue);
        for(var i=0; i<len; i++){
            var num = queue.shift()
            if(num-n === x || num/2 === x || num/3 === x) return answer+1;
            
            if(num%3==0 && num/3 > x) queue.push(num/3);
            if(num%2==0 && num/2 > x) queue.push(num/2);
            if(num-n > x) queue.push(num-n);
        }
        answer++;
    }
    return -1;
}