class Solution {
    public int minSwaps(String s) {
        int ob = 0;
        int cb = 0;

        for(char c: s.toCharArray()) {
            if(c == '[') {
                ob++;
            }
            else{
                if(ob > 0) {
                    ob--;
                }
                else{
                    cb++;
                }
            }
        }

        double ans = (double) cb/2;

        return (int)Math.ceil(ans);
        
    }
}