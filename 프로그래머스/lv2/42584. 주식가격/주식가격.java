import java.util.Stack;

class Info{
    int index;
    int price;
    public Info(int index, int price){
        this.index = index;
        this.price = price;
    }
}
class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        Stack<Info> st = new Stack<>();
        
        for(int i=0; i<len; i++){
            while(!st.isEmpty() && st.peek().price > prices[i]){
                Info pop = st.pop();
                answer[pop.index] = i - pop.index;
            }
            st.push(new Info(i, prices[i]));
        }
        
        while(!st.isEmpty()){
            Info pop = st.pop();
            answer[pop.index] = len - pop.index -1;
        }
        return answer;
    }
}