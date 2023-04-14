import java.util.ArrayList;

class Solution {
    static ArrayList<int[]> list = new ArrayList<>();
    static void dfs(int n, int start, int to, int mid){
        if(n == 1){
            list.add(new int[]{start, to});
            return;
        }
        
        dfs(n-1, start, mid, to);
        list.add(new int[]{start, to});
        dfs(n-1, mid, to, start);
    }
    public int[][] solution(int n) {
        dfs(n, 1, 3, 2);
        int[][] answer = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}