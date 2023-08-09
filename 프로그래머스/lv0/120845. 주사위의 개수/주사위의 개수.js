function solution(box, n) {
    var [x, y, z] = box;
    return Math.floor(x/n)* Math.floor(y/n)* Math.floor(z/n);
}