class Solution {
    public int solution(int[] array) {
        int answer = 0, max = -1;
        int[] index = new int[1000];
        for(int arr: array){
            index[arr]++;
            if(index[arr]>max){
                max = index[arr];
                answer = arr;
            }else if(index[arr]==max) { answer = -1; }
        }
        return answer;
    }
}