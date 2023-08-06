function solution(sides) {
    var max = Math.max(sides[0], sides[1]);
    var min = Math.min(sides[0], sides[1]);
    return (max+min-1)-max + min;
}