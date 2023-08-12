class Solution {
    public int solution(int price) {
        int answer = 0;
        double percent = 0.0;
        if(price >= 500000){
            percent = 0.2;
        }else if(price >= 300000){
            percent = 0.1;
        }else if(price >= 100000){
            percent = 0.05;
        }
        answer = (int)(price-price*percent);
        return answer;
    }
}