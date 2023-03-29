import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	int pri=0;
    	if(a==b&&b==c) {
    		pri=10000+a*1000;
    	}
    	else if(a==b||a==c) {
    		pri=1000+a*100;
    	}
    	else if(b==c) {
    		pri=1000+b*100;
    	}
    	else {
    		if(a>b&&a>c) {pri=a*100;}
    		else if(b>c) {pri=b*100;}
    		else {pri=c*100;}
    	}
    	System.out.println(pri);
    }
}