class Solution {
    public int solution(int[][] sizes) {
        int x=0, y=0;
        int xmax=0, ymax=0;
        for(int i=0; i<sizes.length; i++){
            x = Math.max(sizes[i][0], sizes[i][1]);
            y = Math.min(sizes[i][0], sizes[i][1]);
            xmax = Math.max(xmax, x);
            ymax = Math.max(ymax, y);
        }
        return xmax*ymax;
    }
}