import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        bw.close();
    }
}