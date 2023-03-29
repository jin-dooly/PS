import java.util.StringTokenizer;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        String s;
        StringTokenizer st;
        for(int i=0;i<t;i++){
            int sum=0;
            s=br.readLine();
            st=new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                sum+=Integer.parseInt(st.nextToken());
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}