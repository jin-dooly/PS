package Y2023.March.week4;

import java.io.*;
import java.util.StringTokenizer;
/*

 미해결

 */
public class q2104 {
    static long max=0;
    static int[] arr;
    static long find(int start, int end){
        if(start == end) return arr[start]*arr[start];
        int mid = (start+end)/2;
        max = Math.max(find(start, mid), find(mid, end));
        return max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0; !st.hasMoreTokens(); i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
}
