import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String word=sc.next();
        int[] alp=new int[26];
        char ch;
        for(int i=0;i<word.length();i++) {
        	ch= word.charAt(i);
        	if(ch>91) {ch-=32;}
        	alp[(int)ch-'A']++;
        }
        int max=0;
        char m='?';
        for(int i=0;i<26;i++) {
        	if(max==alp[i]) {
        		m='?';
        	}
        	else if(max<alp[i]) {
        		max=alp[i];
        		m=(char)(i+'A');
        	}
        }
        System.out.println(m);
    }
}