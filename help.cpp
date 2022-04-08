
#include <bits/stdc++.h>
using namespace std;

    
     int jump(vector<int>& nums) {
        if(nums.size()==1)return 0;
        int lengh=0;
        int a=0;
        for(int i=0;i<=lengh;i++){
            if(lengh<max(lengh,nums[i]+i)){
                lengh=max(lengh,nums[i]+i);
                a++;
            }
            if(lengh>=nums.size()-1){
                return a;
            }
        }
        return a;;
    }
    
    int main(){
        vector<int> height{2,3,1,1,4};
        // int n=height.size();
        // vector<int> dp(n,-1);
       cout<<jump(height);
        return 0;
    }
