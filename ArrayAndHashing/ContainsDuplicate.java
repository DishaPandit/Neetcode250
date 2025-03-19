package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1};
        boolean ans = containsDuplicate2(nums);
        System.out.println(ans);
    }

    //method 2
    //TC - O(N)
    //SC - O(N)
    public static boolean containsDuplicate2(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        return !(hs.size()==nums.length);
    }

    //method 3
    //TC - O(N log N)
    //SC - O(1)
    public static boolean containsDuplicate3(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

    //method 4
    //TC - O(N^2)
    //SC - O(1)
    public static boolean containsDuplicate4(int[] nums) {

        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    return true;
                }
            }
        }
        return false;
    }

}
