import java.util.Queue;
import java.util.LinkedList;

class Info{
    int y;
    int count;
    public Info(int y, int cnt){
        this.y = y;
        count = cnt;
    }
}
class Solution {
    public int solution(int x, int y, int n) {
        Queue<Info> que = new LinkedList<>();
        int answer = -1;

        que.add(new Info(y, 0));
        while(!que.isEmpty()){
            Info get = que.poll();
            if(get.y == x){
                answer = get.count;
                break;
            }

            if(get.y-n >= x) que.add(new Info(get.y-n, get.count+1));
            if(get.y/2 >= x && get.y%2 ==0) que.add(new Info(get.y/2, get.count+1));
            if(get.y/3 >= x && get.y%3 ==0) que.add(new Info(get.y/3, get.count+1));
        }
        return answer;
    }
}