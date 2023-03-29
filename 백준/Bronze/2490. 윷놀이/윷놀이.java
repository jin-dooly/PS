import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt;
        for(int i=0; i<3; i++){
            cnt = 0;
            for(int j=0; j<4; j++){
                if(sc.nextInt()==0){
                    cnt++;
                }
            }
            if(cnt == 0)
                System.out.println("E");
            else if(cnt == 1)
                System.out.println("A");
            else if(cnt == 2)
                System.out.println("B");
            else if(cnt == 3)
                System.out.println("C");
            else if(cnt == 4)
                System.out.println("D");
        }
    }
}