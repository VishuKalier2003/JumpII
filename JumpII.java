/* You are given an integer array nums... You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position... Return true if you can reach the last index, or false otherwise...
 * Eg 1: nums = [2,3,1,1,4]          Output = true
 * Eg 2: nums = [2,5,0,0]            Output = true
 * Eg 3: nums = [3,2,1,0,4]          Output = false
 */
import java.util.*;
public class JumpII
{
    public boolean CanJump(int nums[])
    {
        int dp[] = new int[nums.length];
        dp[dp.length-1] = 0;    // Setting last index to zero...
        for(int i = dp.length-2; i >= 0; i--)
            dp[i] = nums[i] + i;    // Updating the DP Array with the maximum index we can reach from i th index...
        for(int i = 0; i < dp.length; i++)
        {
            if(dp[i] >= nums.length-1)    // If from any index we can reach the end, return true...
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the number of jumps : ");
        x = sc.nextInt();
        int jump[] = new int[x];
        for(int i = 0; i < jump.length; i++)
        {
            System.out.print("Enter the value of "+(i+1)+" th Jump : ");
            jump[i] = sc.nextInt();
        }
        JumpII jumpII = new JumpII();    // Object creation...
        System.out.println("Possibility of reaching the End : "+jumpII.CanJump(jump));
        sc.close();
    }
}

// Time Complexity  - O(n) time...
// Space Complexity - O(n) space...

/* DEDUCTIONS :- 
 * 1. Since we want to reach the end, we traverse backwards for the bottom-up approach...
 * 2. We store the maximum index we can reach for every index and its cumulative jump...
*/