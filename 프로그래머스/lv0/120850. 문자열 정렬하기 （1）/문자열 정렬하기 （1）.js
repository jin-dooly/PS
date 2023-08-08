function solution(my_string) {
    return my_string
        .split(/[a-z]|/g)
        .filter(e=>e)
        .map(Number).sort();
}
