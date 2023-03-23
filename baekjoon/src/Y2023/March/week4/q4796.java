package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int l,p,v,days, i=1;
        while(true){
            String[] testCase = br.readLine().split(" ");
            l = Integer.parseInt(testCase[0]);
            p = Integer.parseInt(testCase[1]);
            v = Integer.parseInt(testCase[2]);
            if(l==0 && p==0 && v==0) break;
            days = ((v/p)*l) + Math.min(l, v%p);
            sb.append("Case ").append(i++).append(": ").append(days).append('\n');
        }
        System.out.println(sb);
    }
}
