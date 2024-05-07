function solution(want, number, discount) {
    let answer = 0;
    let wantArr = want.reduce((arr, cur, idx) => {
        for(let i=0; i<number[idx]; i++) arr.push(cur);
        return arr;
    }, [])
    
    for (let i=0; i<discount.length; i++) {
        let newDisc = discount.slice(i, i+10);
        for(let j=0; j<wantArr.length; j++) {
            let hasIdx = newDisc.indexOf(wantArr[j]);
            
            if(hasIdx < 0) {
                break;
            }
            
            newDisc[hasIdx] = "";
            if(j === wantArr.length - 1) {
                answer++;
            }
        }
    }
    return answer;
}