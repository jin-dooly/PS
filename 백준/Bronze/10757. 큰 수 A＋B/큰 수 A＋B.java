import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String sa=st.nextToken();
        String sb=st.nextToken();
        int max= Math.max(sa.length(), sb.length());
        int[] a= new int[max+1];
        int[] b= new int[max+1];
        for(int i=sa.length()-1, j=0; i>=0; i--, j++) {
        	a[j]= sa.charAt(i)-'0';
        }
        for(int i=sb.length()-1, j=0; i>=0; i--, j++) {
        	b[j]= sb.charAt(i)-'0';
        }
        int sum;
        for(int i=0;i<max;i++) {
        	sum=a[i]+b[i];
        	a[i]=sum%10;
        	a[i+1]+=sum/10;
        }
        if(a[max]!=0) {
        	bw.write(a[max]+'0');
        }
        for(int i=max-1;i>=0;i--) {
        	bw.write(a[i]+'0');
        }
    	br.close();
    	bw.close();
    }
}