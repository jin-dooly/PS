function solution(nums) {
    var answer = new Set();
    nums.forEach(n=> answer.add(n));
    return Math.min(answer.size, Math.floor(nums.length/2));
}