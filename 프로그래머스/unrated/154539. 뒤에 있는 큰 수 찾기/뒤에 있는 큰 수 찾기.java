class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        int[] idx = new int[len];
        answer[len-1] = -1;
        idx[len-1] = -1;
        for(int i=len-2; i>=0; i--){
            if(numbers[i] == numbers[i+1]) {
                answer[i] = answer[i+1];
                idx[i] = idx[i+1];
            }
            else if(numbers[i] < numbers[i+1]){
                answer[i] = numbers[i+1];
                idx[i] = i+1;
            }
            else{
                if(answer[i+1] > numbers[i]){
                    answer[i] = answer[i+1];
                    idx[i] = idx[i+1];
                }else{
                    int k = idx[i+1];
                    while(true){
                        if(k == -1){
                            answer[i] = -1;
                            idx[i] = -1;
                            break;
                        }else if(answer[k] > numbers[i]){
                            answer[i] = answer[k];
                            idx[i] = idx[k];
                            break;
                        }else{
                            k = idx[k];
                        }
                    }
                }
            }
        }
        return answer;
    }
}