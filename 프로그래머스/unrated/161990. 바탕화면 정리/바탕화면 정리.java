class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = 50, luy = 50, rdx = 0, rdy = 0;
        for(int i=0; i<wallpaper.length; i++){
            char[] row = wallpaper[i].toCharArray();
            for(int j=0; j<row.length; j++){
                if(row[j] == '#'){
                    if(lux > i) lux = i;
                    if(luy > j) luy = j;
                    if(rdx <= i) rdx = i+1;
                    if(rdy <= j) rdy = j+1;
                }
            }
        }
        return answer = new int[]{lux, luy, rdx, rdy};
    }
}