function solution(A, B) {
    var arr = A.split("");
    for(var i=0; i<arr.length; i++){
        if(arr.join("") === B) return i;
        var tmp = arr.pop();
        arr.unshift(tmp);
    }
    return -1;
}