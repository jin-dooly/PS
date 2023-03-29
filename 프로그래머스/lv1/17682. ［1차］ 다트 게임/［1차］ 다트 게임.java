class Solution {
    public int solution(String dartResult) {
        int answer = 0, ind = -1;
        int[] chance = new int[3];
        char[] result = dartResult.toCharArray();
        for(char rs : result){
            if(rs>'0'&&rs<='9'){
                chance[++ind] = rs-'0';
            }else if(rs=='0'){
                if(ind!=-1 && chance[ind]==1) chance[ind] = 10;
                else chance[++ind] = 0;
            }else if(rs=='D'){
                chance[ind] = (int)Math.pow(chance[ind],2);
            }else if(rs=='T'){
                chance[ind] = (int)Math.pow(chance[ind],3);
            }else if(rs=='*'){
                chance[ind] *= 2;
                if(ind-1 > -1) chance[ind-1] *=2;
            }else if(rs=='#'){
                chance[ind] *= -1;
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(chance[i]);
            answer += chance[i];
        }
        return answer;
    }
}