class Solution {
    public int solution(int[] nums) {
        int len = nums.length;
        int answer = 0, sum = 0;
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len; k++){
                    if(nums[i]%2!=0 || nums[k]%2!=0 || nums[j]%2!=0){
                        sum = nums[i]+nums[j]+nums[k];
                        for(int l=2; l<=sum; l++){
                            if(l==sum)
                                answer++;
                            else if(sum%l==0)
                                break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}