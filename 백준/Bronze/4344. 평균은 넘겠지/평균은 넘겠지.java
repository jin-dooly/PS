import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c=sc.nextInt();
        int[] arr;
        int n, sum, std;
        double avg;
        for(int i=0;i<c;i++){
            n=sc.nextInt();
            arr=new int[n];
            sum=0;
            std=0;
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            avg=sum/n;
            for(int k: arr){
                if(avg<k){std++;}
            }
            bw.write(String.format("%.3f%%\n", (double)std/n*100.0));
        }
        bw.close();
    }
}