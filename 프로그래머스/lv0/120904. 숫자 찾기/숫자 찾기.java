class Solution {
    public int solution(int num, int k) {
        
        String str = Integer.toString(num);
        int answer = str.indexOf(Integer.toString(k)) == -1? -1 : str.indexOf(Integer.toString(k))+1;
        return answer;
    }
}