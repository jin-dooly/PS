import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s=sc.next();
    	int sec=0;
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(ch<='R') {
    			sec+=(ch+1)/3-19;
    		}
    		else if(ch=='Z') {
    			sec+=10;
    		}
    		else {
    			sec+=ch/3-19;
    		}
    	}
    	System.out.println(sec);
    }
}