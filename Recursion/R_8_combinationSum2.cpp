#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void combnation(vector<int> arr,set<vector<int> > &ans,vector<int> &ds,int index,int target){
    if(index==arr.size()){
    if(target==0){
        ans.insert(ds);
    }
    return;
    }
    if(arr[index]<=target){
        ds.push_back(arr[index]);
        combnation(arr,ans,ds,index+1,target-arr[index]);
        ds.pop_back();
    }
    combnation(arr,ans,ds,index+1,target);
}

void combnation2(vector<int> arr,vector<vector<int> > &ans,vector<int> &ds,int index,int target){
    
    if(target==0){
        ans.push_back(ds);
    
    return;
    }
    for(int i=index;i<arr.size();i++){
         if(i>index && arr[i]==arr[i-1]) continue; 
            if(arr[i]>target) break; 
        ds.push_back(arr[i]);
        combnation2(arr,ans,ds,i+1,target-arr[i]);
        ds.pop_back();
    }
    }


int main(){
   // https://leetcode.com/problems/combination-sum-ii/
    vector<int> arr={1,1,1,2,2};
    int a=4;       
    set<vector<int> >ans ;
     vector<vector<int> >ans2 ;
    vector<int> ds;
    //combnation(arr,ans,ds,0,a);      // high complexcity cause of set data structure

      combnation2(arr,ans2,ds,0,a);      //modified good less coplecity

    for(auto i:ans2){
        for(auto j:i){
          cout<<j;
        }
        cout<<endl;
    }
    return 0;
}