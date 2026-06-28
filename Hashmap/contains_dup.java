class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> M = new HashSet<>();
        for(int i:nums){
            if(!M.contains(i)){
                M.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}
