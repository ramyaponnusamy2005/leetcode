class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        int firstNum = 1, secondNum = 1, thirdNum = 0;
        for(int i = 2; i < n + 1; i++){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        return thirdNum;
    }
}