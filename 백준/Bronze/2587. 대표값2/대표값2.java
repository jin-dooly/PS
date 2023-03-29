import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        for(int i=0; i<4; i++){
            for(int j=i ; j<5; j++){
                if(nums[i]>nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println(sum/5);
        System.out.println(nums[2]);
    }
}