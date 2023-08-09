class Solution {
    public int solution(int[] numbers, int k) {
        int answer = (k*2-1)%numbers.length;
        answer = (answer==0 ? numbers.length : answer);
        return answer;
    }
}