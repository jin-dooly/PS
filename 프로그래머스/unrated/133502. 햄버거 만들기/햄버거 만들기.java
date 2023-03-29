import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<ingredient.length; i++){
            if(st.size()<3){
                st.push(ingredient[i]);
                continue;
            }else if(ingredient[i]==1){
                if(st.peek()==3){
                    st.pop();
                    if(st.peek()==2){
                        st.pop();
                        if(st.peek()==1){
                            st.pop();
                            answer++;
                            continue;
                        }
                        st.push(2);
                    }
                    st.push(3);
                }
            }
            st.push(ingredient[i]);
        }
        
        return answer;
    }
}