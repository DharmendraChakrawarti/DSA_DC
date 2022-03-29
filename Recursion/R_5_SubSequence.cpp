#include<iostream>
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
	void solve(vector<int>& nums,vector<int>output,int index,vector<vector<int>>&ans)
	{
		if(index>=nums.size())
		{
			ans.push_back(output);
			return;
		}
		

		int element=nums[index];
		output.push_back(element);
		 solve(nums,output,index+1,ans);
           output.pop_back();
        solve(nums,output,index+1,ans);

	}
	vector<vector<int>> subsets(vector<int>& nums) {
	vector<vector<int>>ans;
	vector<int>output;
	int index=0;
	solve(nums,output,index,ans);

	return ans;
	}
};
void printF(vector<int> &vec,int arr[],int n,int index){
    if(index==n){
        for(auto i:vec){
            cout<<i<<" ";
        }
        cout<<endl;
        return;}
        //take or pick the element 
        vec.push_back(arr[index]);
        printF(vec,arr,n,index+1);
        vec.pop_back();

        //to do not take element or remove
        printF(vec,arr,n,index+1); 
}
int main(){
   // https://leetcode.com/problems/subsets/
    int arr[]={2,4,5};
    vector<int> vec;
    // printF(vec,arr,3,0);
    Solution d;
    vector<int> ve={2,4,5};
     vector<vector<int>>ans=d.subsets(ve);
     for(auto i:ans){
        for(auto j:i){
          cout<<j;
        }
        cout<<endl;
    }
    return 0;
}