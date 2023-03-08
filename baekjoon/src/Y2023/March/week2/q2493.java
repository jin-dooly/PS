package Y2023.March.week2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class q2493 {
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

         /*

        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        String[] tow = br.readLine().split(" ");
        int ind;
        for(int i=0; i<tow.length; i++){
            int t = Integer.parseInt(tow[i]);
            ind = i;
            while(!st.isEmpty()){
                if(st.peek()> t){
                    sb.append(ind).append(" ");
                    break;
                }
                st.pop();
                ind--;
            }
            if(st.isEmpty())
                sb.append(0).append(" ");
            st.push(t);
        }
        System.out.println(sb);
         */

    }
}
