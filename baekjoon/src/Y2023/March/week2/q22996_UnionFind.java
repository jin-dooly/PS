package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*



미해결




 */
public class q22996_UnionFind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int q = Integer.parseInt(in[1]);
        System.out.println(n+" "+q);
        String[] par = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        System.out.println(m);
        String[] mlist = new String[m];
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(" ").append(q).append('\n');
        for(int i=0; i<m; i++){
            mlist[i] = br.readLine();
        }

        for(int i=0; i<m && q>0; i++, q--){
            sb.append(2).append(' ').append(mlist[i]+"").append('\n');
            for(int k=0; k<n && q>0; k++, q--){
                if(par[k].equals(mlist[i]+"")){
                    sb.append(1).append(' ').append(k+1).append(' ').append(mlist[i]).append('\n');
                    par[k] = (k+1)+"";
                }
            }
        }
        for(int k=0; k<n; k++){
            if(!par[k].equals((k+1)+"")){
                sb.append(1).append(' ').append(k+1).append(' ').append(par[k]).append('\n');
                par[k] = (k+1)+"";
            }
        }
        System.out.println(sb);
    }
}
