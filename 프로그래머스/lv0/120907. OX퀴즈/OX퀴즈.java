class Solution {
    public String[] solution(String[] quiz) {
        int i=0, x=0, y=0, len=quiz.length;
        String[] answer = new String[len];
        String[][] split = new String[len][5];
        
        for(String q:quiz){
            split[i] = q.split(" ");
        
            x = Integer.parseInt(split[i][0]);
            y = Integer.parseInt(split[i][2]);
            if(split[i][1].equals("+")){
                answer[i] = Integer.toString(x+y);
            }else{
                answer[i] = Integer.toString(x-y);
            }
            answer[i] = answer[i].equals(split[i][4]) ? "O" : "X" ;
            i++;
        }
        return answer;
    }
}