import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int min=-1, sum=0;
        for(int i=m;i<=n;i++) {
        	if(is_Prime(i))  {
        		sum+=i;
        		min= min<0? i: min;
        	}
        }
        if(sum!=0) System.out.println(sum); 
        System.out.println(min);
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