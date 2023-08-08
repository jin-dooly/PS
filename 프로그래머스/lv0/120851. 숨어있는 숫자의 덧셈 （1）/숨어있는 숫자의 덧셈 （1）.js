function solution(my_string) {
    return my_string.split("").map(e => e.replace(/[A-z]/g,"")).reduce((acc, cur) => acc+Number(cur), 0);
}