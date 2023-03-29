import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	int cnt=1;
    	int min=2;
    	if(n==1) {
    		cnt=1;
    	}
    	else {
    		while(min<=n) {
    			min+=6*cnt;
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
}