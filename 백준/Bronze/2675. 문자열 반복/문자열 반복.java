import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        String[] s=new String[t];
        for(int i=0;i<t;i++){
            s[i]=nstr(sc.nextInt(), sc.next());
        }
        for(String v:s) {
        	System.out.println(v);
        }
    }
    public static String nstr(int r,String s){
        String ns="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<r;j++){
                ns+=s.charAt(i);
            }
        }
        return ns;
    }
}