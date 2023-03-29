import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =  new StringBuilder();
        int[] cnt = new int[26];
        Arrays.fill(cnt, 0);
        char[] chars = sc.next().toCharArray();
        for(int i=0; i<chars.length; i++){
            cnt[chars[i]-'a']++;
        }
        for(int i=0; i<26; i++){
            sb.append(cnt[i]+" ");
        }
        System.out.println(sb);
    }
}