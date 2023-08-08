class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] gather = {"a","e","i","o","u"};
        for(String gat:gather){
            answer = answer.replace(gat,"");
        }
        return answer;
    }
}