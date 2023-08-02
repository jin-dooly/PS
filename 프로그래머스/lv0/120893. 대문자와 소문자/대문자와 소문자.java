class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch;
        for(int i=0; i<my_string.length(); i++){
            ch= my_string.charAt(i);
            if(ch>=65 && ch<=90){
                answer += (char)(ch+32);
            }else{
                answer += (char)(ch-32);
            }
        }
        return answer;
    }
}