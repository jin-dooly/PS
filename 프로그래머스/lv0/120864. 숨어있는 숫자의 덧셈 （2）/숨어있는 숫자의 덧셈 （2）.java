class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-z]|[A-Z]");
        
        for(String s: str){
            if(s.equals("")){ continue; }
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}