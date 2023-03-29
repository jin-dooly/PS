class Solution {
    public int solution(int num) {
        int answer = 0;
        double result = num;
        while(result!=1){
            answer++;
            if(result%2==0){
                result/=2;
            }else{
                result = (result*3)+1;
            }
            if(answer>500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}