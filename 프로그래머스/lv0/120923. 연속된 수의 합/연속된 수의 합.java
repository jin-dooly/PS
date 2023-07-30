class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/num, cnt=0;
        if(num%2 == 0){
            cnt = num/2;
            answer[cnt] = mid+1;
            answer[cnt-1] = mid;
            for(int i=cnt+1, j=cnt-2; j>=0; i++,j--){
                answer[i] = answer[i-1]+1;
                answer[j] = answer[j+1]-1;
            }
        }else{
            cnt = num/2;
            answer[cnt] = mid;
            for(int i=cnt+1, j=cnt-1; j>=0; i++,j--){
                answer[i] = answer[i-1]+1;
                answer[j] = answer[j+1]-1;
            }
        }
        return answer;
    }
}