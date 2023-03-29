class Solution {
    public int[] solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        int[] answer = new int[arr.length];
        for(int i=0, j=arr.length-1, tmp=0; i<arr.length; i++,j--){
            answer[i] = arr[j]-'0';
        }
        return answer;
    }
}