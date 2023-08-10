class Solution {
    public String solution(int age) {
        String answer = "";
        for(int i=1; age/10!=0||age%10!=0; i*=10,age/=10){
            answer = (char)(age%10+97)+answer;
        }
        return answer;
    }
}