package Y2023.March.week1;

import java.util.Scanner;

public class q10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] stack = new int[10000];
        int top=-1;

        int len = sc.nextInt();
        String order = "";

        for(int i=0; i<len; i++){
            order = sc.next();
            if(order.equals("push")){
                stack[++top] = sc.nextInt();
            }
            else if(order.equals("pop")){
                if(top!=-1)
                    sb.append(stack[top--]+"\n");
                else
                    sb.append("-1\n");
            }
            else if (order.equals("size")){
                sb.append((top+1)+"\n");
            }
            else if (order.equals("empty")) {
                if(top==-1)
                    sb.append(1+"\n");
                else
                    sb.append(0+"\n");
            }
            else if (order.equals("top")) {
                if(top!=-1)
                    sb.append(stack[top]+"\n");
                else
                    sb.append(-1+"\n");
            }
        }
        System.out.println(sb);
    }
}
