package Y2023.March.week1;

import java.util.*;
public class stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int len = sc.nextInt();
        String[] strings = new String[len];
        sc.nextLine();
        for(int i=0; i<len; i++){
            strings[i] = sc.nextLine();
        }
        for(int i=0; i<len; i++){
            String[] words = strings[i].split(" ");
            System.out.print("Case #"+(i+1)+": ");
            for(int j=words.length-1; j>=0; j--){
                System.out.print(words[j]+" ");
            }
            System.out.println();
        }
    }
}
