import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double max=0;
        double[] arr= new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if( max<arr[i]){ max=arr[i]; }
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]/max*100;
        }
        System.out.println(sum/n);
    }
}