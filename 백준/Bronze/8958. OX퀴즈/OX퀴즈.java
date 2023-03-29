import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n=sc.nextInt();
        String[] arr=new String[n];
        int score,cnt;
        for(int i=0;i<n;i++){
        	cnt=0;
        	score=0;
            arr[i]=sc.next();
            for(int j=0;j<arr[i].length();j++){
                cnt= (arr[i].charAt(j)=='O')?cnt+1:0;
                score+=cnt;
            }
            bw.write(score+"\n");
        }
        bw.close();
    }
}