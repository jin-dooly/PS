class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long)(money - (1+count)*(count/2.0)*price);
        if(answer>=0) return 0;
        return -answer;
    }
}