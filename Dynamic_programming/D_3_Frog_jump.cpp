    #include <bits/stdc++.h>
    using namespace std;
     int jump1(vector<int> &height,vector<int> &dp,int n){
          if(n==0)return 0;
          if(dp[n]!=-1)return dp[n];
          int left = jump1(height,dp,n-1)+abs(height[n]-height[n-1]);
          int right = INT_MAX;
          if(n>1){right =jump1(height,dp,n-2)+abs(height[n]-height[n-2]);}
          return dp[n]=min(left,right);
     }

 int jump2(vector<int> &height,vector<int> &dp,int n){
          dp[0]=0;
          for(int i=1;i<n;i++){
          int left = dp[i-1]+abs(height[n]-height[n-1]);
          int right = INT_MAX;
          if(n>1){right =dp[i-2]+abs(height[n]-height[n-2]);}
           dp[i]=min(left,right);
     }
    return dp[n-1];
     }

int jump3(vector<int> &height,vector<int> &dp,int n){
         int prev=0;
         int prev2=0;
int curr;
          for(int i=1;i<n;i++){
          int left = prev+abs(height[n]-height[n-1]);
          int right = INT_MAX;
          if(n>1){right =prev2+abs(height[n]-height[n-2]);}
           curr=min(left,right);
           prev2= prev;
           prev=curr;
     }
    return prev;
     }
    int main(){
        vector<int> height{30,10,60,10,60,50};
        int n=height.size();
        vector<int> dp(n,-1);
        //cout<<jump1(height,dp,n-1);    // method 1 less optimized
        cout<<jump3(height,dp,n-1);    // method 1 less optimized
        return 0;
    }