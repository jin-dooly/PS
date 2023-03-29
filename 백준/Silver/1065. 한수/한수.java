import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        if(n<100){ans=n;}
        else{
            for(int i=100;i<=n;i++){
                if(hansu(i)){ans++;}
            }
            ans+=99;
        }
        System.out.println(ans);
    }
    public static boolean hansu(int i){
        int n=i/10;
        int dist=i%10-n%10;
        for(int j=n/10;j>0;j/=10){
            if(dist!=n%10-j%10){
                return false;
            }
            n/=10;
        }
        return true;
    }
}