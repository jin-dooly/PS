function solution(my_string) {
    return my_string.split(/[A-z]/g).filter(e=>e).reduce((acc,cur)=>acc+Number(cur), 0);
}