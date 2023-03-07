package Y2023.March.week2;

import java.io.*;
import java.util.Stack;


public class q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sb = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> rstack = new Stack<>();
        Stack<Character> lstack = new Stack<>();
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            lstack.add(str.charAt(i));
        }
        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++){
            String orderS = br.readLine();
            char order = orderS.charAt(0);
            if(order=='L' && !lstack.isEmpty()){
                rstack.push(lstack.pop());
            }else if(order=='D' && !rstack.isEmpty()){
                lstack.push(rstack.pop());
            }else if(order=='B' && !lstack.isEmpty()){
                lstack.pop();
            }else if(order=='P'){
                lstack.push(orderS.charAt(2));
            }
        }
        while(!lstack.isEmpty()){
            rstack.push(lstack.pop());
        }
        while(!rstack.isEmpty()){
            sb.append(rstack.pop());
        }
        sb.flush();
        sb.close();
        br.close();
    }
}
