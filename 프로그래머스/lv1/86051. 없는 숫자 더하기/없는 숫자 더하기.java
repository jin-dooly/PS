import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean key;
        for(int i=0; i<=9; i++){
            key = false;
            for(int num : numbers){
                if(i == num){
                    key = true;
                    break;
                }
            }
            if(!key)
                answer+=i;
        }
        return answer;
    }
}