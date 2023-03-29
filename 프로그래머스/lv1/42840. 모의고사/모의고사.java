import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr2 = {1,3,4,5};
        int[] arr3 = {3,1,2,4,5};
        int a1=0, a2=0, a3=0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==(i%5)+1)
                a1++;
            if(i%2==0){
                if(answers[i]==2) a2++;
            }else if(answers[i]==arr2[(i/2)%4]){
                a2++;
            }
            if(answers[i]==arr3[(i/2)%5])
                a3++;
        }
        
        List<Integer> list = new ArrayList<>();
        int max = Math.max(a1,Math.max(a2,a3));
        if(max==a1) list.add(1);
        if(max==a2) list.add(2);
        if(max==a3) list.add(3);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}