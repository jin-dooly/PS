class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1=0, i2=0;
        for(String gw: goal){
            if(i1<cards1.length && gw.equals(cards1[i1])){
                i1++;
            }else if(i2<cards2.length && gw.equals(cards2[i2])){
                i2++;
            }else{
                return "No";
                
            }
        }
        return "Yes";
    }
}