import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        do{
            boolean[] arr = new boolean[n*2+1];
            arr[0] = arr[1] = true;
            for(int i=2; i<=n; i++){
                for(int j=i+i; j<=n*2; j+=i){
                    if(!arr[j]) arr[j] = true;
                }
            }
            int cnt = 0;
            for(int i=n+1; i<=n*2; i++){
                if(!arr[i]) cnt++;
            }
            sb.append(cnt).append('\n');
            n = Integer.parseInt(br.readLine());
        }while(n != 0);
        System.out.println(sb);
    }
}
