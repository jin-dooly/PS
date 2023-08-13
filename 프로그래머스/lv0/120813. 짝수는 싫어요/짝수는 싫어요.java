class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        answer = new int[n/2+n%2];
        int ind = 0;
        for(int i=1; i<=n; i+=2){
            answer[ind++] = i;
        }
        return answer;
    }
}