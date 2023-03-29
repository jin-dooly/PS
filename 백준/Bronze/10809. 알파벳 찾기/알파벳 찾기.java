import java.util.Scanner;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String word=sc.next();
        int[] alp=new int[26];
        for(int i=0;i<26;i++){ alp[i]=-1; }
        char ch;
        for(int i=0;i<word.length();i++){
            ch=word.charAt(i);
            if(alp[(int)ch-'a']==-1){
                alp[(int)ch-'a']=i;
            }
        }
        for(int i:alp){bw.write(i+" ");}
        bw.close();
    }
}