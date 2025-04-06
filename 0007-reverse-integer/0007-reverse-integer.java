class Solution {
    public int reverse(int x) {
        int result = 0;
        boolean flag = false;
        if(x == 0) return 0;
        if(x < 0){
            flag = true;
            x *= -1;
        }

        while(x > 0){
            int digit = x % 10;
            if(result > Integer.MAX_VALUE / 10) return 0;
            result = result * 10 + digit;
            x /= 10;
        }

        if(!flag) return result;
        else return result * -1;
    }
}