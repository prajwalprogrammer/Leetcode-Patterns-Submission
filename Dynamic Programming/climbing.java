// Recursion
class Solution { 
    public int solve(int curr_step, int dest){
        if(dest == curr_step){
            return 1;
        }
        if(dest < curr_step){
            return 0;
        }
        return solve(curr_step + 1,dest) + solve(curr_step + 2,dest);
    }
    public int climbStairs(int n) {
        return solve(0,n);
    }
}


// DP 
class Solution {
public:
int t[46];
    int helper(int n){
        if(n<0){
            return 0;
        }
        if(t[n] !=-1){
            return t[n]; 
        }
        if(n==0){
            return 1;
        }
        int one_step=helper(n-1);
        int second_step=helper(n-2);
        return t[n]=one_step+second_step;
        
    }
    int climbStairs(int n) {
        memset(t,-1,sizeof(t));
        return helper(n);
        // return count;
    }
};