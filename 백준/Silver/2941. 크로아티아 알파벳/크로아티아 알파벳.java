import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String s=sc.next();
    	String[] cro= {"c=","c-","dz=","d-","lj","nj","s=","z="};
    	for(String c:cro) {
    		s=s.replaceAll(c, "a");
    	}
    	System.out.println(s.length());
    }
}