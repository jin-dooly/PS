class Solution {
    public int solution(int order) {
        int answer = 0, num = order%10;
        while(order!=0 || num!=0){
            if(num !=0 && (num)%3 == 0){
                answer++;
            }
            order/=10;
            num=order%10;
        }
        return answer;
    }
}