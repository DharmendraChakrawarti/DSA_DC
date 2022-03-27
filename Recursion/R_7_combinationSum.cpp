#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void combnation(vector<int> arr,vector<vector<int> > &ans,vector<int> &ds,int index,int target){
    if(index==arr.size()){
    if(target==0){
        ans.push_back(ds);
    }
    return;
    }
    if(arr[index]<=target){
        ds.push_back(arr[index]);
        combnation(arr,ans,ds,index,target-arr[index]);
        ds.pop_back();
    }
    combnation(arr,ans,ds,index+1,target);
}
int main(){
   // https://leetcode.com/problems/combination-sum/
    vector<int> arr={2,3,6,7};
    int a=7;       
    vector<vector<int> >ans ;
    vector<int> ds;
    combnation(arr,ans,ds,0,a);
    for(auto i:ans){
        for(auto j:i){
          cout<<j;
        }
    }
    return 0;
}