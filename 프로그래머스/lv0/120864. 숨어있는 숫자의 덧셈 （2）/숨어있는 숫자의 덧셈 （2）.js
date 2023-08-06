function solution(my_string) {
    return my_string.split(/[a-z]|[A-z]/g).filter(e=>e).reduce((acc,cur)=>acc+=Number(cur), 0);
}