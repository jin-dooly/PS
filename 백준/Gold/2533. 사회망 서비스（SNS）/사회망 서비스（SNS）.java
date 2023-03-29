import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int n, cnt = 0;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean findEA(int i){
        if(list.get(i).size() == 1 && visit[list.get(i).get(0)]) return false;

        visit[i] = true;
        boolean childEA = true;
        for(int child : list.get(i)){
            if(visit[child]) continue;
            childEA = childEA&findEA(child);
        }

        if(childEA) return false;
        else {
            cnt++;
            return true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n];
        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<n-1; i++){
            String[] tmp = br.readLine().split(" ");
            list.get(Integer.parseInt(tmp[0])-1).add(Integer.parseInt(tmp[1])-1);
            list.get(Integer.parseInt(tmp[1])-1).add(Integer.parseInt(tmp[0])-1);
        }
        
        findEA(0);
        System.out.println(cnt);
    }
}
