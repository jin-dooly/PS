function solution(cards1, cards2, goal) {
    //두가지 풀이
    // 1. 투포인터
    /*
    let p1 = 0;
    let p2 = 0;
    for(var i=0; i<goal.length; i++) {
        if(p1<cards1.length && goal[i] == cards1[p1]){
            p1++;
            continue;
        }
        if(p2<cards2.length && goal[i] == cards2[p2]){
            p2++;
            continue;
        }
        return "No";
    }
    return "Yes";
    */
    
    // 2. 배열 비교
    let case1 = goal.filter(e => cards1.includes(e)).join(" ");
    let case2 = goal.filter(e => cards2.includes(e)).join(" ");
    
    return cards1.join(" ").includes(case1) && cards2.join(" ").includes(case2) ? "Yes" : "No";
}