function solution(numbers, hand) {
    var L = [3, 0]
    var R = [3, 2]
    
    return numbers.map(n => {
        if(n%3 === 1) {
            L = [Math.floor(n/3), 0];
            return 'L';
        }
        if(n%3 === 0 && n !== 0) {
            R = [n/3 - 1, 2]
            return 'R';
        }
        
        var row = Math.floor(n === 0 ? 3 : n/3);
        var l_diff = Math.abs(row - L[0]) + Math.abs(L[1] - 1);
        var r_diff = Math.abs(row - R[0]) + Math.abs(R[1] - 1);
        
        if(l_diff === r_diff) {
            if(hand === 'left'){
                L = [row, 1];
                return 'L'
            }
            else {
                R = [row, 1];
                return 'R'
            }
        }
        
        if(l_diff < r_diff){
            L = [row, 1];
            return 'L'
        }
        else {
            R = [row, 1];
            return 'R'
        }
    }).join('')
}