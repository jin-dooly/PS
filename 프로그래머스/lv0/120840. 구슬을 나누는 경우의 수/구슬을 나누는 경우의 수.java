class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        for(int i=balls-share; i>=1; i--,balls--){
            answer *= balls;
            System.out.println("1. "+answer);
            answer /= i;
            System.out.println("2. "+answer);
        }
        return (int)Math.round(answer);
    }
}