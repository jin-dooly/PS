class Solution {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer("");
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        boolean[] key = {true, true};
        
        for(int i=0; i<X.length() || i<Y.length(); i++){
            if(i<X.length())
                x[X.charAt(i)-'0']++;
            if(i<Y.length())
                y[Y.charAt(i)-'0']++;
        }
        
        for(int i=9; i>=0; i--){
            if(x[i]!=0 && y[i]!=0){
                key[0] = false;
                for(int j=0; j<x[i] && j<y[i]; j++){
                    answer.append(i);
                }
                if(i!=0) key[1] = false;
            }
        }
        
        if(key[0]){
            answer.append(-1);
        }else if(key[1]){
            answer = new StringBuffer("0");
        }
        
        return answer.toString();
    }
}