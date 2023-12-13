function solution(arr1, arr2) {
    return arr1.map((numbers, row) => numbers.map((n, col) => n + arr2[row][col]));
}