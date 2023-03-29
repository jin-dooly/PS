class Solution {
    
    public int distance(int loc, int num){
        int dis = 0;
        if(loc%3==0){
            dis++;
            dis += Math.abs(num+1-loc)/3;
        }else if(loc%3==1){
            dis++;
            dis += Math.abs(num-1-loc)/3;
        }else{
            dis += Math.abs(num/3-loc/3);
        }
        return dis;
    }
    
    public String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer("");
        int right=12, left=10;
        int rcnt=0, lcnt=0;
        String use = "";
        for(int num : numbers){
            if(num==0) num = 11;
            if(num%3==1){
                use = "L";
            }else if(num%3==0){
                use = "R";
            }else{
                rcnt = distance(right, num);
                lcnt = distance(left, num);
                
                if(rcnt>lcnt){
                    use = "L";
                }else if(rcnt<lcnt){
                    use = "R";
                }else{
                    use = hand.equals("right") ? "R" : "L" ;
                }
            }
            
            answer.append(use);
            if(use.equals("R")) 
                right = num;
            else 
                left = num;
        }
        return answer.toString();
    }
}