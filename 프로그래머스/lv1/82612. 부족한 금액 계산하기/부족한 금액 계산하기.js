function solution(price, money, count) {
    var answer = money - ((count+1)*count / 2)*price;
    return answer < 0 ? answer*-1 : 0;
}