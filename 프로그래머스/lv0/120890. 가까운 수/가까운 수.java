class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        for(int i:array){
            if(Math.abs(n-i)==min && answer>i){
                answer = i;
            }else if(Math.abs(n-i)<min){
                min = Math.abs(n-i);
                answer = i;
            }
        }
        return answer;
    }
}