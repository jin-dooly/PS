function solution(n, arr1, arr2) {
    var answer = [];
    for(let i=0; i<n; i++) {
        let bin1 = arr1[i].toString(2);
        bin1 = '0'.repeat(n - bin1.length) + bin1;
        
        let bin2 = arr2[i].toString(2);
        bin2 = '0'.repeat(n - bin2.length) + bin2;
        
        let str = ''
        
        for(let j=0; j<n; j++) {
            (bin1[j] === '1' || bin2[j] === '1') ? str+='#' : str+=' '
        }
        answer.push(str)
    }
    return answer;
}