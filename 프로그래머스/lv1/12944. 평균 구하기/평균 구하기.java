class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i:arr){
            if(i == 0)
                continue;
            answer += i;
        }
        return answer/arr.length;
    }
}