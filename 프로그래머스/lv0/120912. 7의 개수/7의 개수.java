class Solution {
    public int solution(int[] array) {
        int answer = 0, tmp=0;
        for(int i:array){
            tmp = i;
            while(tmp/10!=0||tmp%10!=0){
                if(tmp%10 == 7)
                    answer++;
                tmp/=10;
            }
        }
        return answer;
    }
}