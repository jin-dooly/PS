class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int x=0, i=0;
        for(String e: arr){
            if(e.equals("x")){
                x++;
            }else if(e.contains("x")){
                x += Integer.parseInt(e.replace("x",""));
            }else{
                i += Integer.parseInt(e);
            }
        }
        if(i==0){
            answer = x==1 ? "x" : x + "x";
        }else if(x == 0){
            answer = i + "";
        }else{
            answer = x==1 ? "x" + " + " + i : x + "x" + " + " + i;
        }
        System.out.println(arr[0]);
        return answer;
    }
}