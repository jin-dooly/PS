class Solution {
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<n/2; i++){
            answer.append("수박");
        }
        if(n%2!=0)
            answer.append("수");
        return answer.toString();
    }
}