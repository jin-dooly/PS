import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            for(int j=0;j<i;j++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}