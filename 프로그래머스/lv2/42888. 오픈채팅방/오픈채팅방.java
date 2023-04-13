import java.util.HashMap;
import java.util.ArrayList;

class State{
    String id;
    int state;
    public State(String id, int state){
        this.id = id;
        this.state = state;
    }
}

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> nick = new HashMap<>();
        ArrayList<State> records = new ArrayList<>();

        for(int i=0; i<record.length; i++){
            String[] split = record[i].split(" ");
            if(split[0].equals("Enter")){
                nick.put(split[1], split[2]);
                records.add(new State(split[1], 1));
            }
            else if(split[0].equals("Leave")){
                records.add(new State(split[1], 0));
            }
            else{
                nick.put(split[1], split[2]);
            }
        }

        String[] answer = new String[records.size()];
        for(int i=0; i<records.size(); i++){
            State get = records.get(i);
            if(get.state == 1){
                answer[i] = nick.get(get.id) + "님이 들어왔습니다.";
            }
            else{
                answer[i] = nick.get(get.id) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}