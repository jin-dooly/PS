import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int input;
        for(int i=0; i<len; i++ ){
            input = Integer.parseInt(br.readLine());
            if(input == 0 ){
                st.pop();
            }else{
                st.push(input);
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        System.out.println(sum);
    }
}
