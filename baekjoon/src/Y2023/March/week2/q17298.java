package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q17298 {
    public static void main(String[] args) throws IOException {
        Stack<int[]> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[] nge = new int[len];
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<len; i++){
            int in = Integer.parseInt(token.nextToken());
            while(!st.empty() && in > st.peek()[1]){
                nge[st.pop()[0]] = in;
            }
            st.push(new int[]{i, in});
        }
        for(int i=0; i<len; i++){
            if(nge[i] == 0) sb.append(-1).append(' ');
            else sb.append(nge[i]).append(' ');
        }
        System.out.println(sb);
    }
}
