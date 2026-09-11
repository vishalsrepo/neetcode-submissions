class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int num: nums) {
            if(num < 0) {
                prod = prod*(-1);
            }
            else if (num == 0){
                prod = prod*0;
            }
            else {
                prod = prod*1;
            }          
        }

        return prod;
    }
}