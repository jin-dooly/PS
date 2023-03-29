class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        char[] ch = s.toCharArray(); 
        int i=0;
        for(char c : ch){
            if(c != ' '){
                if(i%2 == 0 && (c>='a' && c<='z')){
                    answer.append((char)(c-32));
                }else if(i%2 == 1 && (c>='A' && c<='Z')){
                    answer.append((char)(c+32));
                }else{
                    answer.append(c);
                }
                i++;
            }else{
                answer.append(c);
                i=0;
            }
        }
        return answer.toString();
    }
}