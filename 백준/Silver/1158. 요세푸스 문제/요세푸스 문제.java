import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        sb.append('<');
        while(true){
            for(int i=0; i<k-1; i++){
                list.offer(list.poll());
            }
            sb.append(list.poll());
            if(list.isEmpty())
                break;
            sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
    }
}
