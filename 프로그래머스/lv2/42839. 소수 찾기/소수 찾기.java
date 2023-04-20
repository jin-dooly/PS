import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static int len, max=0;
    static int[] number;
    static ArrayList<Integer> list = new ArrayList<>();

    static void numList(int i, StringBuilder sb, boolean[] visit){
        sb.append(number[i]);
        visit[i] = true;
        for(int j=0; j<len; j++){
            if(j == i || visit[j]) continue;
            numList(j, new StringBuilder(sb.toString()), visit.clone());
        }
        int num = Integer.parseInt(sb.toString());
        if(!list.contains(num) && num>1) list.add(num);
        max = Math.max(max, num);
    }

    public int solution(String numbers) {
        len = numbers.length();
        char[] charNum = numbers.toCharArray();
        Arrays.sort(charNum);
        number = new int[len];

        for(int i=0, j=len-1; j>=0; i++, j--){
            number[i] = charNum[j]-'0';
        }
        for(int i=0; i<len; i++){
            if(number[i]==0) continue;
            numList(i, new StringBuilder(), new boolean[len]);
        }

        boolean[] prime = new boolean[max+1];
        for(int i=2; i<max/2; i++){
            if(prime[i]) continue;
            for(int j=i+i; j<=max; j+=i){
                prime[j] = true;
            }
        }

        int answer = 0;
        for (Integer integer : list) {
            if(!prime[integer]) answer++;
        }

        return answer;
    }
}