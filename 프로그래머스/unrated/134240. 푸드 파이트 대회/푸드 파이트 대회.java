class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer("0");
        for(int i=food.length-1; i>0; i--){
            for(int j=0; j<food[i]/2; j++){
                answer.insert(0,i).append(i);
            }
        }
        return answer.toString();
    }
}