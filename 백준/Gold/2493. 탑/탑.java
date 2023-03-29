

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<int[]> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        String[] tow = br.readLine().split(" ");
        int ind;
        for(int i=0; i<tow.length; i++){
            int t = Integer.parseInt(tow[i]);
            ind = i;
            while(!st.isEmpty()){
                if(st.peek()[1] > t){
                    sb.append(st.peek()[0]).append(" ");
                    break;
                }
                st.pop();
            }
            if(st.isEmpty())
                sb.append(0).append(" ");
            st.push(new int[] {i+1, t});
        }
        System.out.println(sb);
    }
}
