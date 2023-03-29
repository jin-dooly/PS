import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	int sum=0, N=0;
    	for(int i=0; sum<n;i++) {
    		sum+=i;
    		N=i;
    	}
    	sum=n-(sum-N);
    	int a1=1, a2=N;
    	for(int i=1;i<sum;i++) {
    		a1+=1;
    		a2-=1;
    	}
    	if(N%2==0) {
    		System.out.println(a1+"/"+a2);
    	}else {
    		System.out.println(a2+"/"+a1);
    	}
    }
}