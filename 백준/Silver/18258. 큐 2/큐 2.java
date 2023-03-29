import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[] que = new int[2000000];
        int front = 0, back = 0;
        for(int i=0; i<len; i++){
            String order = br.readLine();
            if(order.contains("push")){
                String[] spl = order.split(" ");
                que[back++] = Integer.parseInt(spl[1]);
                continue;
            }else if(back-front<=0){
                if(order.equals("pop")||order.equals("front")||order.equals("back"))
                    sb.append(-1);
                else if(order.equals("size")) sb.append(0);
                else if(order.equals("empty")) sb.append(1);
            }else{
                if(order.equals("pop")){
                    sb.append(que[front++]);
                }else if(order.equals("size")){
                    sb.append(back-front);
                }else if(order.equals("empty")){
                    sb.append(0);
                }else if(order.equals("front")){
                    sb.append(que[front]);
                }else if(order.equals("back")){
                    sb.append(que[back-1]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
