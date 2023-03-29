import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	if(n==1) return;
    	String bf;
    	do {
    		if(is_Prime(n)) {
    			bw.write(String.valueOf(n));
    			break;
    		}
    		else {
    			for(int i=2;i<n;i++) {
    				if(is_Prime(i)&&n%i==0) {
    					bw.write(String.valueOf(i)+"\n");
    					n=n/i;
    					break;
    				}
    			}
    		}
    	}while(true);
    	bw.close();
    }
    static boolean is_Prime(int num) {
    	if(num==1)  return false;
    	for(int i=2;i<=Math.sqrt(num);i++) {
    		if(num%i==0) return false;
    	}
    	return true;
    }
}