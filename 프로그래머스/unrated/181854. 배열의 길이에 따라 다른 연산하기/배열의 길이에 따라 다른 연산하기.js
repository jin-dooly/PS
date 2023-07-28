function solution(arr, n) {
    var a = arr.length%2;
    for(var i=0; i<arr.length; i++){
        if(i%2 != a) arr[i]+=n;
    }
    return arr;
}