import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        do{
            bw.write(Integer.toString(a+b)+"\n");
            a=sc.nextInt();
            b=sc.nextInt();
        }while(a+b!=0);
        bw.close();
    }
}