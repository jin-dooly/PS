function solution(my_string) {
    console.log(Number('1'));
    return my_string.split("").reduce((acc, cur) => Number(cur) ? acc+Number(cur) : acc, 0);
}