class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String temp = "";
        for(int i=0; i<babbling.length; i++){
            temp = babbling[i].replace("aya","1").replace("ye","2").replace("woo","3").replace("ma","4");
            if(temp.contains("11") || temp.contains("22") || temp.contains("33") || temp.contains("44"))
                continue;
            else{
                temp = temp.replaceAll("[0-9]","");
                if(temp.length()==0) answer++;
            }
        }
        return answer;
    }
}