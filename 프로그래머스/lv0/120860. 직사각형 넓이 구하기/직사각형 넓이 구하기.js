function solution(dots) {
    var width = Math.max(Math.abs(dots[0][0]-dots[1][0]), Math.abs(dots[0][0]-dots[2][0]));
    var height = Math.max(Math.abs(dots[0][1]-dots[1][1]), Math.abs(dots[0][1]-dots[2][1]));
    return width * height;
}