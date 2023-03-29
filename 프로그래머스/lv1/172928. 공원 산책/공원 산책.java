class Solution {
    static int x, y, W, H;
    static boolean[][] map;
    static void order(char dir, int step){
        if(dir=='E' && x+step < W){
            for(int i=x+1; i<=x+step; i++){
                if(map[y][i]) return;
            }
            x += step;
        }
        else if(dir=='W' && x-step >= 0){
            for(int i=x-1; i>=x-step; i--){
                if(map[y][i]) return;
            }
            x -= step;
        }
        else if(dir=='S' && y+step < H){
            for(int i=y+1; i<=y+step; i++){
                if(map[i][x]) return;
            }
            y += step;
        }
        else if(dir=='N' && y-step >= 0){
            for(int i=y-1; i>=y-step; i--){
                if(map[i][x]) return;
            }
            y -= step;
        }
    }
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        W = park[0].length();
        H = park.length;
        map = new boolean[H][W];
        
        for(int i=0; i<H; i++){
            char[] pos = park[i].toCharArray();
            for(int j=0; j<W; j++){
                if(pos[j] == 'X'){
                    map[i][j] = true;
                }else if(pos[j] == 'S'){
                    y = i;
                    x = j;
                }
            }
        }
        
        for(String route : routes){
            char op = route.charAt(0);
            int n = route.charAt(2)-'0';
            
            order(op, n);
        }
        
        return answer = new int[] {y, x};
    }
}
