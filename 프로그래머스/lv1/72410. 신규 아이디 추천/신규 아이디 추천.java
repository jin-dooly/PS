class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        //step 1
        answer = answer.toLowerCase()
            .replaceAll("[^a-z|0-9|\\-|\\_|\\.]", "")
            .replaceAll("\\.+", ".")
            .replaceAll("^[.]|[.]$","");
        //step 5
        if(answer.equals("")) answer = "a";
        //step 6
        if(answer.length()>=16) answer = answer.substring(0,15).replaceAll("[.]$","");
        //step 7
        if(answer.length()==1)
            answer += answer + answer;
        else if(answer.length()==2)
            answer += answer.substring(1,2);
        return answer;
    }
}