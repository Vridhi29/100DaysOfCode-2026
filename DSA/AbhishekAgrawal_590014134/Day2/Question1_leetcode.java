public class Question1_leetcode {
    public int removeElement(int[] nums, int val) {
        int j=0;
        int i=0;
        while(i<nums.length && j<nums.length-1){
            while(j<nums.length && nums[j]==val)
            {
                j++;
            }
            nums[i]=nums[j];
            j++;
            i++;
        }
        return i;
    }
}
