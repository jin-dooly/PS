import java.util.*;

class Solution {
    final long MAX = Long.MAX_VALUE;
    public String[] solution(int[][] line) {
        long minX = MAX, maxX = -MAX, minY = MAX, maxY = -MAX;
        ArrayList<long[]> list = new ArrayList<>();
        
        for(int i=0; i<line.length-1; i++){
            for(int j=i+1; j<line.length; j++){
                long A = line[i][0];
                long B = line[i][1];
                long E = line[i][2];
                long C = line[j][0];
                long D = line[j][1];
                long F = line[j][2];
                long bot = A*D - B*C;
                if(bot != 0 && (B*F-E*D)%bot==0 && (E*C-A*F)%bot==0) {
                    long x = (B*F-E*D)/bot;
                    long y = (E*C-A*F)/bot;
                    list.add(new long[]{x, y});
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }
        long X = -minX;
        maxX += X;
        long Y = -minY;
        maxY += Y;

        char[][] star = new char[1001][1001];
        for(int i=0; i<1001; i++){
            Arrays.fill(star[i], '.');
        }
        for(long[] pos : list){
            star[(int) (pos[1]+Y)][(int) (pos[0]+X)] = '*';
        }
        
        String[] answer = new String[(int) (maxY+1)];
        for(int y = (int) maxY, idx = 0; y>=0; y--, idx++){
            StringBuilder sb = new StringBuilder();
            for(int x=0; x<=maxX; x++){
                sb.append(star[y][x]);
            }
            answer[idx] = sb.toString();
        }
        return answer;
    }
}