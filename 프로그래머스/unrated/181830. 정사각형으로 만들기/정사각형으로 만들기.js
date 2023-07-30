function solution(arr) {
    var row = arr.length;
    var col = arr[0].length;
    
    if(row == col) return arr;
    if(row > col){
        arr.map(e => {
            for(var i=col; i<row; i++){
                e.push(0);
            }
        })
    }else{
        for(var i=row; i<col; i++){
            arr.push(new Array(col).fill(0));
        }
    }
    return arr;
}