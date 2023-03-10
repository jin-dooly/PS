package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q11502 {
    public static int[] prime(int k){
        boolean[] arr = new boolean[k+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=k; i++){
            if(arr[i]) continue;
            list.add(i);
            for(int j=i; j<=k; j+=i){
                if(!arr[j]){
                    arr[j] = true;
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static int[] find(int[] prime, int k){
        for(int i=0; i<prime.length; i++){
            for(int j=i; j<prime.length; j++){
                for (int l=j; l<prime.length; l++){
                    if(prime[i]+prime[j]+prime[l] == k)
                        return new int[]{prime[i], prime[j], prime[l]};
                }
            }
        }
        return new int[]{0};
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int K = Integer.parseInt(br.readLine());
            int[] value = find(prime(K),K);
            if(value[0] == 0) sb.append(0).append('\n');
            else sb.append(value[0]).append(' ').append(value[1]).append(' ').append(value[2]).append('\n');
        }
        System.out.println(sb);
    }
}
