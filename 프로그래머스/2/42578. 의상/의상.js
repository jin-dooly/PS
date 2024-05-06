function solution(clothes) {
    var answer = 1;
    let obj = clothes.reduce((newObj, cur) => {
        newObj[cur[1]] ? newObj[cur[1]] += 1 : newObj[cur[1]] = 1;
        return newObj;
    }, {})
    Object.values(obj).forEach((cur) => answer *= cur + 1);
    
    return answer - 1;
}