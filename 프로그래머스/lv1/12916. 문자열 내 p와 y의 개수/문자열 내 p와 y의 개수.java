class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        int i=0;
        for(String ch:arr){
            if(ch.equalsIgnoreCase("p"))
                i++;
            else if(ch.equalsIgnoreCase("y"))
                i--;
        }

        return i == 0 ? true : false;
    }
}