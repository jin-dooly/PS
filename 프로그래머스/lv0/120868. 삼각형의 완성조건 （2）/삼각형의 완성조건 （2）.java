class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = sides[0]>sides[1]? sides[1]:sides[0];
        int max = sides[0]<sides[1]? sides[1]:sides[0];
        answer = (max+min) - (max-min) -1;
        return answer;
    }
}