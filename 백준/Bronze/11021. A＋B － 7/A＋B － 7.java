import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        int a,b;
        for(int i=1;i<=t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            bw.write("Case #"+i+": "+(a+b)+"\n");
        }
        bw.close();
    }
}