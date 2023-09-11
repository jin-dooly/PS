let N = Number(require('fs').readFileSync("dev/stdin").toString().trim());

let count = 0;
let queenColumnPosition = new Array(N).fill(false);

// DFS + back tracking
function dfs(row) {
  if(row === N){
    count++;
    return;
  }

  for(var i=0; i<N; i++) {
    if(isPossible(row, i)){
      queenColumnPosition[row] = i;
      dfs(row+1);
      queenColumnPosition[row] = false;
    }
  }
}

function isPossible(row, nextCol) {
  for(var checkRow=0; checkRow < row; checkRow++) {
    var hasColumn = queenColumnPosition[checkRow] === nextCol;
    var hasSlash = row-checkRow === Math.abs(nextCol-queenColumnPosition[checkRow]);
    // (현재 행 - n번째 행) 과 (현재 열 - n번째 행에 갔던 열) 이 같으면 대각선에 있다는 뜻
    // 현재 열보다 오른쪽 대각선 위에 있었다면 음수 값이므로 Math.abs 처리

    if(hasColumn || hasSlash) return false;
  }
  return true;
}

dfs(0);

console.log(count);