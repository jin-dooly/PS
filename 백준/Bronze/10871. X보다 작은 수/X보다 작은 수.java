import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n=sc.nextInt();
        int x=sc.nextInt();
        boolean key=false;
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            if(v<x){
                if(key){
                   bw.write(" "); 
                }
                bw.write(Integer.toString(v));
                key=true;
            }
        }
        bw.close();
    }
}