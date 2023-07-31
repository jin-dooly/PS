class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = len%n == 0? new String[len/n]: new String[len/n+1];
        int i = 0;
        for(; i<=len-n; i+=n){
            answer[i/n] = my_str.substring(i,i+n);
        }
        if(len%n != 0){
            answer[answer.length-1] = my_str.substring(i,len);
        }
        return answer;
    }
}