import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int len = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<len; i++){
            String[] words = sc.nextLine().split(" ");
            for(int j=0; j<words.length; j++){
                char[] ch = words[j].toCharArray();
                for(int k=ch.length-1; k>=0; k--){
                    sb.append(ch[k]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}