import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i])
                min = arr[i];
        }
        int cnt = 0;
        for(int i : arr){
            if(i==min) continue;
            answer[cnt] = i;
            cnt++;
        }
        return answer;
    }
}