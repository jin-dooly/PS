import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int min=0,max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){min=arr[i];}
            else if(max<arr[i]){max=arr[i];}
        }
        System.out.print(min+" "+max);
    }
}