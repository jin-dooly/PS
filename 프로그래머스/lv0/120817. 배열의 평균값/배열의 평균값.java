class Solution {
    public double solution(int[] numbers) {
        double answer = 0, hap = 0;
        for(int num: numbers){
            hap += num;
        }
        answer = hap/numbers.length;
        return answer;
    }
}