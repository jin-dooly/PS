import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str1 = sc.nextLine().toCharArray();
        char[] str2 = sc.nextLine().toCharArray();

        int[] cnt = new int[26];
        for(int i=0; i<str1.length; i++){
            cnt[str1[i]-'a']++;
        }
        for(int i=0; i<str2.length; i++){
            cnt[str2[i]-'a']--;
        }
        int sum=0;
        for(int i=0; i<26; i++){
            if(cnt[i]!=0){
                sum+=Math.abs(cnt[i]);
            }
        }
        System.out.println(sum);
    }
}