class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length, cnt = 0;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            cnt = 0;
            for(int j=0; j<len; j++){
                if(i==j) continue;
                if(numlist[i]-n == 0) break;
                if(Math.abs(numlist[i]-n) > Math.abs(numlist[j]-n)){
                    cnt++;
                }else if(Math.abs(numlist[i]-n) == Math.abs(numlist[j]-n)){
                    if(numlist[i]-n<0) cnt++;
                }
            }
            answer[cnt] = numlist[i];
        }
        return answer;
    }
}