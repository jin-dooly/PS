import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        int len = Integer.parseInt(br.readLine());
        Stack<int[]> st = new Stack<>();
        //0:키, 1:cnt(중복)
        for(int i=0; i<len; i++){
            int in = Integer.parseInt(br.readLine());
            int[] man = {in, 1};
            while(!st.isEmpty() && in >= st.peek()[0]){
                int[] pop = st.pop();
                sum += pop[1];
                if(in == pop[0]) man[1] += pop[1];
            }
            if(!st.isEmpty()) sum++;
            st.push(man);
        }
        System.out.println(sum);
    }
}
