function solution(num_list, n) {
    var answer = 0;
    return num_list.filter(e => e==n).length ? 1 : 0;
}