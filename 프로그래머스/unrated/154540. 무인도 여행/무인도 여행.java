import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static int n, m, sum;
    static int[][] map;
    static boolean[][] visit;
    static int dfs(int y, int x){
        if(visit[y][x] || map[y][x]==0) return 0;
        
        visit[y][x] = true;
        
        if(y>0) dfs(y-1, x);
        if(y<n-1) dfs(y+1, x);
        if(x>0) dfs(y, x-1);
        if(x<m-1) dfs(y, x+1);
        
        return sum += map[y][x];
    }
    public int[] solution(String[] maps) {
        ArrayList<Integer> answer = new ArrayList<>();
        n = maps.length;
        m = maps[0].length();
        map = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                char info = maps[i].charAt(j);
                map[i][j] = info=='X' ? 0 : info-'0';
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] != 0 && !visit[i][j]){
                    sum = 0;
                    int result = dfs(i, j);
                    if(result != 0) answer.add(result);
                }
            }
        }
        if(answer.size()==0) return new int[]{-1};
        else {
            int[] ans = answer.stream().mapToInt(i->i).toArray();
            Arrays.sort(ans);
            return ans;
        }
    }
}