class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] area = new boolean[n+1];
        for(int i : section){
            area[i] = true;
        }
        
        int key = section.length;
        while(key != 0){
            int idx = section[key-1];
            for(int i=0; i<m && idx>=0; i++, idx--){
                if(area[idx]){
                    area[idx] = false;
                    key--;
                }
            }
            answer++;
        }
        return answer;
    }
}