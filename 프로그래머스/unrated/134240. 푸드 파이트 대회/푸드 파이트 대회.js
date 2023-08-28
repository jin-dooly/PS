function solution(food) {
    let half = food.reduce((acc, cur, idx) => idx ? acc+idx.toString().repeat(cur/2) : acc, '');
    return half + 0 + [...half].reverse().join("");
}