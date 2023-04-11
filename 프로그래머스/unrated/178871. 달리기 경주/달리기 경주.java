import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> playerInfo = new HashMap<>();
        for(int i=0; i<players.length; i++){
            playerInfo.put(players[i], i);
        }
        for(int i=0; i<callings.length; i++) {
            int get = playerInfo.get(callings[i]);
            String chName = players[get-1];
            
            players[get-1] = callings[i];
            players[get] = chName;
            
            playerInfo.put(callings[i], get-1);
            playerInfo.put(chName, get);
        }
        return players;
    }
}