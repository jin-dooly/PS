package Y2023.February.week4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class q1874 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = 1, in = 0;
        boolean key = true;
        int len = sc.nextInt();
        List<String> answer = new ArrayList<String>();

        for(int i=0; i<len; i++){
            //n<=in push repeat -> pop
            //n>in pop == in -> continue, else return
            in = sc.nextInt();
            if(n <= in){
                while(n <= in) {
                    stack.push(n);
                    n++;
                    answer.add("+");
                }
                stack.pop();
                answer.add("-");
            }else{
                if(stack.pop()!=in) {
                    System.out.println("NO");
                    key = false;
                    break;
                }
                answer.add("-");
            }
        }
        if(key) {
            for (int i = 0; i < answer.size(); i++) {
                System.out.println(answer.get(i));
            }
        }
    }
}
