class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      String tmp;

      for(int i = 0 ; i < n ; i++){
          tmp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
          answer[i] = tmp.substring(tmp.length() - n).replaceAll("1", "#").replaceAll("0", " ");
      }
      return answer;
  }
}