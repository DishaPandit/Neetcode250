package ArrayAndHashing;

import java.util.Arrays;

public class ConcatinationOfArray {

    /*
        TC - O(N)
        SC - O(N)
     */

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];

        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}

/*
Using JAVA 8

public int[] getConcatenation(int[] nums) {
        return IntStream.concat(Arrays.stream(nums),Arrays.stream(nums)).toArray();
    }

 */
