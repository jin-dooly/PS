package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q9252 {
    static char[] str1, str2;
    static int[][] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();
        table = new int[str1.length+1][str2.length+1];
        for(int i=0; i<=str1.length; i++){
            Arrays.fill(table[i], 0);
        }
        for(int i=1; i<=str1.length; i++){
            for(int j=1; j<=str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    table[i][j] = table[i-1][j-1]+1;
                }else{
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }

        int comp;
        int i = str1.length;
        int j = str2.length;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(true){
            comp = table[i][j];
            if(comp == 0) break;
            if(comp == table[i-1][j]){
                i-=1;
            }else if(comp == table[i][j-1]){
                j-=1;
            }else{
                cnt++;
                sb.insert(0, str1[i-1]);
                i-=1;
                j-=1;
            }
        }
        System.out.println(cnt);
        if(cnt!=0){
            System.out.println(sb);
        }
    }
}
