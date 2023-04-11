class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int len = sequence.length;
        if(sequence[0] == sequence[len-1]) return answer = new int[]{0,k/sequence[0]-1};
        int min = len, sum = 0;
        for(int left=0, right=0; right<len; right++){
            sum += sequence[right];
            while(sum > k && left<=right){
                sum -= sequence[left++];
            }
            if(sum == k && min > right-left) {
                answer[0] = left;
                answer[1] = right;
                min = right-left;
            }
        }
        return answer;
    }
}