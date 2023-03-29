import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int v= sc.nextInt();
        char c='F';
        if(v>=90&&v<=100){ c='A'; }
        else if(v>=80){ c='B'; }
        else if(v>=70){ c='C'; }
        else if(v>=60){c='D';}
        System.out.print(c);
    }
}