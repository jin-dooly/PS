const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function Node(prev, next) {
	this.prev = prev;
	this.next = next;
}

rl.on('line', function (line) {
    input = line.split(' ');
    rl.close();
}).on('close', function () {
    let N = Number(input[0]);
    let K = Number(input[1]);
    
    let answer = [];
    let nodes = [];
    
    for(var i=0; i<N; i++){
        nodes.push(new Node((i+N-1)%N, (i+1)%N));
    }

    let next = K-1;
    for(var i=0; i<N; i++){
        let now = nodes[next];
        answer.push(next+1);
        //console.log(next, now);
        nodes[now.prev].next = now.next;
        nodes[now.next].prev = now.prev;
        for(var j=0; j<K; j++){
          next = nodes[next].next;
        }
        //console.log("next = ", next);
    }
    
    console.log("<"+answer.join(", ")+">");
});