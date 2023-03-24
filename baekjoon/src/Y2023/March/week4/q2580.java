package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2580 {
    static int[][] board = new int[9][9];
    static StringBuilder sb = new StringBuilder();

    static void dfs(int i, int j){
        if(j == 9) {
            dfs(i+1, 0);
            return;
        }
        if(i == 9) {
            for(int[] row : board){
                for(int num : row){
                    sb.append(num).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if(board[i][j] == 0) {
            for (int k = 1; k <= 9; k++) {
                if (check(i, j, k)) {
                    board[i][j] = k;
                    dfs(i, j+1);
                }
            }
            board[i][j] = 0;
            return;
        }
        dfs(i, j+1);
    }

    static boolean check(int row, int col, int num){
        for(int i=0; i<9; i++){
            if(board[row][i] == num) return false;
            if(board[i][col] == num) return false;
        }
        int rowInd = (row/3)*3;
        int colInd = (col/3)*3;
        for(int i=rowInd; i<rowInd+3; i++){
            for(int j=colInd; j<colInd+3; j++){
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<9; i++){
            String[] line = br.readLine().split(" ");
            for(int j=0; j<9; j++){
                board[i][j] = Integer.parseInt(line[j]);
            }
        }
        dfs(0,0);
    }
}
