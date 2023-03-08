package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class q6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String test = br.readLine();
            if(test.equals("0")) break;
            Stack<long[]> st = new Stack<>();
            long maxA = 0;
            StringTokenizer token = new StringTokenizer(test," ");
            int len = Integer.parseInt(token.nextToken());
            for(int idx = 0; idx < len; idx++){
                long in = Long.parseLong(token.nextToken());
                long[] rac = {idx, in}; //0:index, 1:height
                while(!st.isEmpty() && st.peek()[1] >= in ){
                    long[] pop = st.pop();
                    long width = st.isEmpty() ? idx : idx-1-st.peek()[0];
                    maxA = Math.max(maxA, width*pop[1]);
                }
                st.push(rac);
            }
            while(!st.isEmpty()) {
                long[] pop = st.pop();
                long width = st.isEmpty() ? len: len - 1 - st.peek()[0];
                maxA = Math.max(maxA, width * pop[1]);
            }
            sb.append(maxA).append('\n');
        }
        System.out.println(sb);
    }
}
