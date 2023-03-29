import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	int cnt=0;
    	for(int i=0;i<n;i++) {
    		if(grop(sc.next())) {
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
    public static boolean grop(String s) {
    	boolean[] alp=new boolean[26];
    	char[] ch=s.toCharArray();
    	for(int i=0;i<s.length()-1;i++) {
    		if(alp[ch[i]-'a']) {return false;}
    		else if(ch[i]!=ch[i+1]) {alp[ch[i]-'a']=true;}
    	}
    	if(alp[ch[s.length()-1]-'a']) {return false;}
    	return true;
    }
}