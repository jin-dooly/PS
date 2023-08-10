function solution(emergency) {
    var sort = [...emergency].sort((a,b) => b-a);
    return emergency.map(e => sort.indexOf(e)+1);
}