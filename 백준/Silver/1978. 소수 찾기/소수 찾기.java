import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int in, cnt=0;
        for(int i=0;i<n;i++) {
        	in=Integer.parseInt(st.nextToken());
        	if(is_Prime(in))  cnt++; 
        }
        System.out.println(cnt);
    	br.close();
    }
    static boolean is_Prime(int num) {
    	if(num==1)  return false;
    	for(int i=2;i<=Math.sqrt(num);i++) {
    		if(num%i==0) return false;
    	}
    	return true;
    }
}