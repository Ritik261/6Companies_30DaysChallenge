class NumArray {
    private int[] prefixA;
    public NumArray(int[] nums) {
        int n = nums.length;

        for(int i = 1; i<n ; i++){
            nums[i] += nums[i-1];
        }  
        this.prefixA = nums;
    }
    
    public int sumRange(int left, int right) {
        
        return prefixA[right] - (left > 0 ? prefixA[left - 1] : 0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */