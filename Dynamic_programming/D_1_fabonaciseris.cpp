#include <bits/stdc++.h>
using namespace std;
int fab_1(int n,vector<int> &dp){
if(n<=1) return n;
if(dp[n]!=-1)return dp[n];
return dp[n]=fab_1(n-1,dp)+fab_1(n-2,dp);
}

int fab_2(int n){
    int prev1=0;
    int prev2=1;
    for(int i=2;i<=n;i++){
        int cur1=prev1+prev2;
         prev1=prev2;
         prev2=cur1;
    }
    return prev2;
}
int main(){
    int n=5;
    vector<int> dp(n+1,-1);
    // cout<<fab_1(n,dp);  // brut
    cout<<fab_2(n);  //optimized
    return 0;
}