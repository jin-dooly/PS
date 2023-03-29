import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int len = sc.nextInt();
        int cnt;

        sc.nextLine();
        for(int i=0; i<len; i++){
            cnt = 0;
            char[] ch = sc.nextLine().toCharArray();
            for(char c : ch){
                if(c == '(')
                    cnt++;
                else
                    cnt--;
                if(cnt<0)
                    break;
            }
            if(cnt==0)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);
    }
}