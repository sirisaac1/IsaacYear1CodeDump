package runningsum;
import java.util.*;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
class RunningSum {

    public int[] runningSum(int[] nums) {
        //int i = 1;
        //int L = nums.length-1;
        //int total = 0;
        //while (i<L) {
            //total += nums[i];
            //nums[i] = total;
            //i++;
        //}
        //return nums;
        int[] output = new int[nums.length];
        if (nums.length == 0)
                return output;
        output[0] = nums[0];
        for (int idx = 1; idx < nums.length; idx++) {
            output[idx] = output[idx-1]+ nums [idx];
        }
        return output;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RunningSum ob = new RunningSum();
        //System.out.println("input length of your array");
        //int n=0;
        int[] nums = {2, 4, 6, 9};
        //n = in.nextInt();
        //int n = 4;
        //int[] nums = new int[n];
        //System.out.println("input elements of your array");
        //for (int i = 0; i < n; i++) {
            //nums[i] = in.nextInt();
        //}
        System.out.println(ob.runningSum(nums));
    }
    
}
