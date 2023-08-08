function solution(my_string) {
    return [...my_string]
        .map(e => e.replace(/[a-z]/g, ""))
        .filter(e => e)
        .map(Number).sort();
}