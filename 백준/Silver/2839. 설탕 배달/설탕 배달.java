import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt=n/5;
        if(n==4||n==7) {
        	cnt=-1;
        }
        else if(n%5==2||n%5==4) {
        	cnt+=2;
        }
        else if(n%5==1||n%5==3) {
        	cnt++;
        }
	    bw.write(cnt+"\n");
    	br.close();
    	bw.close();
    }
}