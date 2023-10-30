function solution(s) {
    return !/\D/g.test(s) && (s.length===4 || s.length===6);
}