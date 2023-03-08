package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        int len = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<len; i++){
            int in = Integer.parseInt(br.readLine());
            while(!st.isEmpty() && in >= st.peek()){
                st.pop();
            }
            sum += st.size();
            st.push(in);
        }
        System.out.println(sum);
    }
}
