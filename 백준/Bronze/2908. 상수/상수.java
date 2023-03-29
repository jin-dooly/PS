import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int a=cba(sc.next());
    	int b=cba(sc.next());
    	if(a>b) {System.out.println(a);}
    	else {System.out.println(b);}
    }
    public static int cba(String s) {
    	String ss= ""+s.charAt(2)+s.charAt(1)+s.charAt(0);
    	return Integer.parseInt(ss);
    }
}