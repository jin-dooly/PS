import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int h, w, n, room;
        for(int i=0; i<t;i++) {
	        st = new StringTokenizer(br.readLine());
	        h = Integer.parseInt(st.nextToken());
	        w = Integer.parseInt(st.nextToken());
	        n = Integer.parseInt(st.nextToken());
	        room= n%h!=0? n%h*100+n/h+1 : h*100+n/h;
	        bw.write(room+"\n");
        }
    	br.close();
    	bw.close();
    }
}