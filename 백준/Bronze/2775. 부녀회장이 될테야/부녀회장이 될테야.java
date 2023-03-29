import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int k, n;
        int[][] apt = new int[15][15];
        for(int i=0; i<15; i++) {
        	apt[i][1]=1;
        	apt[0][i]=i;
        }
        for(int i=1;i<15;i++) {
        	for(int j=2;j<15;j++) {
        		apt[i][j]=apt[i][j-1]+apt[i-1][j];
        	}
        }
        for(int i=0; i<t;i++) {
	        k = Integer.parseInt(br.readLine());
	        n = Integer.parseInt(br.readLine());
	        bw.write(apt[k][n]+"\n");
        }
    	br.close();
    	bw.close();
    }
}