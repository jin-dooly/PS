package Y2023.March.week2;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class q5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> lstack = new Stack<>();
        Stack<Character> rstack = new Stack<>();

        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<ch.length; j++){
                if(ch[j]=='<'){
                    if(!lstack.isEmpty())
                        rstack.push(lstack.pop());
                }else if(ch[j]=='>'){
                    if(!rstack.isEmpty())
                        lstack.push(rstack.pop());
                }else if(ch[j]=='-'){
                    if(!lstack.isEmpty())
                        lstack.pop();
                }else{
                    lstack.push(ch[j]);
                }
            }
            while(!lstack.isEmpty()){
                rstack.push(lstack.pop());
            }
            while(!rstack.isEmpty()){
                bw.append(rstack.pop());
            }
            bw.append('\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
