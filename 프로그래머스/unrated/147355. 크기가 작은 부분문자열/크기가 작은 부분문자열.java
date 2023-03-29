class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        int tlen = t.length();
        double pow = Math.pow(10,plen);
        long pi = Long.parseLong(p);
        for(int i=0; i<=tlen-plen; i++){
            if(Long.parseLong(t.substring(i, i+plen)) <= pi)
                answer++;
        }
        return answer;
    }
}