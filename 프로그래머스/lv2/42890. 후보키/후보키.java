import java.util.*;

class Solution {
    static int col, row;
    static List<String> list;
    static void combi(int start, StringBuilder sb){
        sb.append(start);
        for(int i=start+1; i<col; i++){
            combi(i, new StringBuilder(sb.toString()));
        }
        list.add(sb.toString());
    }
    public int solution(String[][] relation) {
        int answer = 0;
        list = new ArrayList<>();
        col = relation[0].length;
        row = relation.length;
        for(int i=0; i<col; i++) {
            combi(i, new StringBuilder());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        while(!list.isEmpty()){
            Set<String> unq = new HashSet<>();
            char[] att = list.get(0).toCharArray();
            list.remove(0);
            for(int i=0; i<row; i++){
                StringBuilder sb = new StringBuilder();
                for(char j: att){
                    sb.append(relation[i][j-'0']);
                }
                if(!unq.add(sb.toString())){
                    break;
                }
                if(i==row-1) {
                    answer++;
                    sb = new StringBuilder(".*");
                    for (char a : att) {
                        sb.append(a - '0').append(".*");
                    }
                    String str = sb.toString();
                    System.out.println(str);
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k).matches(str)) System.out.println(list.remove(k--));
                    }
                }
            }
        }

        return answer;
    }
}