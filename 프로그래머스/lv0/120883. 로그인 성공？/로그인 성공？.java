import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> dbMap = new HashMap<>();
        for(String[] e: db){
            dbMap.put(e[0], e[1]);
        }
        if(dbMap.get(id_pw[0]) != null){
            answer = dbMap.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw";
        }else{
            answer = "fail";
        }
        return answer;
    }
}