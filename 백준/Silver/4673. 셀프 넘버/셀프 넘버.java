import java.io.*;
public  class Main{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] ans= new boolean[10001];
        int num;
        for(int i=1;i<10001;i++){
            num=d(i);
            if(num<10001){ans[num]=true;}
        }
        for(int i=1;i<10001;i++){
            if(ans[i]){continue;}
            bw.write(i+"\n");
        }
        bw.close();
    }
    public static int d(int n){
        int sum=n;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}