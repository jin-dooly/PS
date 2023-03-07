package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            list.add(br.readLine());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] str1 = o1.split(" ");
                String[] str2 = o2.split(" ");

                return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
            }
        });
        for(int i=0; i<len; i++){
            System.out.println(list.get(i));
        }
    }
}
