class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        int dir = ( direction.equals("right")? len-1 : 1);
        for(int i=0; i<len; i++){
            answer[i] = numbers[(i+dir)%len];
        }
        return answer;
    }
}