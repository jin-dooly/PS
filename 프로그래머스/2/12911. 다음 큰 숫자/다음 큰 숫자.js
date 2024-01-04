function solution(n) {
    var len = n.toString(2).replaceAll('0', '').length;
    do{
        n++
    }while(n.toString(2).replaceAll('0', '').length !== len)
    return n;
}