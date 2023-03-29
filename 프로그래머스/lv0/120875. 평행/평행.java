class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[][] arr = new double[3][2];
        arr[0][0] = (dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]*1.0);
        arr[0][1] = (dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]*1.0);
        arr[1][0] = (dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]*1.0);
        arr[1][1] = (dots[1][1]-dots[3][1])/(dots[1][0]-dots[3][0]*1.0);
        arr[2][0] = (dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]*1.0);
        arr[2][1] = (dots[1][1]-dots[2][1])/(dots[1][0]-dots[2][0]*1.0);
        for(int i=0; i<3; i++){
            if(arr[i][0] == arr[i][1]){
                return answer = 1;
            }
        }
        return answer;
    }
}