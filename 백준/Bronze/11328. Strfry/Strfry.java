import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());

        for(int i=0; i<len; i++){
            String[] str = br.readLine().split(" ");
            char[] word1 = str[0].toCharArray();
            char[] word2 = str[1].toCharArray();

            Arrays.sort(word1);
            Arrays.sort(word2);
            if(String.valueOf(word1).equals(String.valueOf(word2))){
                sb.append("Possible").append("\n");
            }else{
                sb.append("Impossible").append("\n");
            }
        }
        System.out.println(sb);
    }
}