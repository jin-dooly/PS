package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        String[] arr = new String[len];
        for(int i=0; i<len; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length()-o2.length();
                }
            }
        });

        for(int i=0; i<len; i++){
            if(i !=0 && arr[i-1].equals(arr[i]))
                continue;
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
    /*
    static int comp(String[] arr, int j){
        String tmp;
        int max;
        if(arr[j*2].length()>arr[j*2+1].length()){
            max = j*2;
        }else if(arr[j*2].length()<arr[j*2+1].length()){
            max = j*2+1;
        }else{
            if(arr[j*2].compareTo(arr[j*2+1])>0)
                max = j*2;
            else
                max = j*2+1;
        }
        if(arr[max].length() > arr[j].length()){
            tmp = arr[j];
            arr[j] = arr[max];
            arr[max] = tmp;
            j = max;
        }else if(arr[max].length() == arr[j].length()){
            if(arr[max].compareTo(arr[j])>0){
                tmp = arr[j];
                arr[j] = arr[max];
                arr[max] = tmp;
                j = max;
            }
        }
        return j;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        String[] arr = new String[len];
        for(int i=0; i<len; i++){
            arr[i] = br.readLine();
        }
        String tmp;
        for(int i=len/2; i>=0; i--){
            if(arr[i*2].length() > arr[i].length()){
                tmp = arr[i];
                arr[i] = arr[i*2];
                arr[i*2] = tmp;
            }
            if(i*2+1<len && arr[i*2+1].length() > arr[i].length()){
                tmp = arr[i];
                arr[i] = arr[i*2+1];
                arr[i*2+1] = tmp;
            }
        }
        tmp = arr[0];
        arr[0] = arr[len-1];
        arr[len-1] = tmp;

        int n = len-1;
        int j=0;
        while(n>1){
            while(j>=n/2){

                if(j == comp(arr, j))
                    break;
                else
                    j = comp(arr,j);
            }
            n--;
        }

        for(int i=0; i<len; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
     */
}
