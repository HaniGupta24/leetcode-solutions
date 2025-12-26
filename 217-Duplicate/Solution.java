class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int arr:nums){
if(!set.add(arr)){
    return true;
}

        }

       return false;
    }
}
