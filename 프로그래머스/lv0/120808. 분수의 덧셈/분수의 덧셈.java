class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2+numer2*denom1;
        int denom = denom1*denom2;
        
        int min = (numer>denom) ? denom : numer;
        for(int i = min/2 ; i >= 2 ; i--){
            if(numer%min==0 && denom%min==0){
                denom = denom/min;
                numer = numer/min;
                break;
            }
            if(denom%i==0 && numer%i==0){
                denom = denom/i;
                numer = numer/i;
            }
        }
        int[] answer = {numer, denom};
        return answer;
    }
}