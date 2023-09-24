function solution(lottos, win_nums) {
    const mystery = lottos.filter(n => n===0).length;
    const correct = lottos.reduce((cnt, n) => win_nums.includes(n)? cnt+1: cnt, 0);
    return [7 - ((correct+mystery) || 1), 7 - (correct || 1)];
}