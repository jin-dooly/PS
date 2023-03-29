import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s;
        int a,b;
        while((s=br.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s);
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(a+b)+"\n");
        }
        bw.close();
    }
}