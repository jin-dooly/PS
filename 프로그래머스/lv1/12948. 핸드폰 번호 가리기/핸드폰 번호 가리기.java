class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        answer = phone_number.substring(0,len- 4).replaceAll(".","*")+ phone_number.substring(len-4,len);
        return answer;
    }
}