class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            
            do{
                answer++;
                if(answer/10 == 3 || answer/10 == 13){
                    System.out.println("ddddd");
                    answer+=10;
                    break;
                }
            }while(answer%3 == 0 || answer%10 == 3);
            System.out.println(i+" : "+answer);
        }
        return answer;
    }
}