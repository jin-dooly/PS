function solution(n, slicer, num_list) {
    var answer = [];
    var [a,b,c] = slicer;
    if(n==1){
        a=0;
        c=1;
    }else if(n==2){
        b=num_list.length-1;
        c=1;
    }else if(n==3){
        c=1;
    }
    
    for(var i=a; i<=b; i+=c){
        answer.push(num_list[i]);
    }
    return answer;
}