import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[] que = new int[10000];
        int front = 0, back = 0;
        for(int i=0; i<len; i++){
            String order = br.readLine();
            if(back >=0 && order.contains("push")){
                String[] spl = order.split(" ");
                que[back++] = Integer.parseInt(spl[1]);
            }else if(back>=front && order.equals("pop")){
                if(back==front){
                    sb.append(-1).append('\n');
                }else{
                    sb.append(que[front++]).append('\n');
                }
            }else if(order.equals("size")){
                if(back-front<0)
                    sb.append(0).append('\n');
                else
                    sb.append(back-front).append('\n');
            }else if(order.equals("empty")){
                if(back-front<=0)
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }else if(order.equals("front")){
                if(back-front<=0)
                    sb.append(-1).append('\n');
                else
                    sb.append(que[front]).append('\n');
            }else if(order.equals("back")){
                if(back-front<=0)
                    sb.append(-1).append('\n');
                else
                    sb.append(que[back-1]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
