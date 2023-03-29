class Solution {
    public long solution(int a, int b) {
        if(a == b) return (long)a;
        int len = (Math.abs(b-a)+1);
        return (long)((a+b)*(len/2.0));
    }
}