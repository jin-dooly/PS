class Solution {
    public int solution(int n) {
        long sqrt = (long)Math.sqrt(n);
        int answer = (n == (int)Math.pow(sqrt,2))? 1 : 2;
        return answer;
    }
}