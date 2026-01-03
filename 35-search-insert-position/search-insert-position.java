public class  main{
public static void  main(String[] args){
int[] nums ={1,3,5,6};
int target =2;
Solution s = new Solution();
int length = s.searchInsert(nums,  target);
System.out.println("Target should be at index:"+length);
}
}
class Solution{
    public int searchInsert(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
