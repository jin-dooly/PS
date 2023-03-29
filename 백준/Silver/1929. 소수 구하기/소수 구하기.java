import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc= new Scanner(System.in);
    	int m=sc.nextInt();
        int n=sc.nextInt();
    	if(n==1) return;
    	for(int i = m; i<= n; i++) {
			if(is_Prime(i)) bw.write(String.valueOf(i)+"\n");
		}
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