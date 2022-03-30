#include<iostream>
#include<bits/stdc++.h>
using namespace std;

    void func(vector<bool> freq, vector<int> &arr,  vector<int> &ds, vector<vector<int> >&ans ) {
            if(ds.size()==arr.size()){
            ans.push_back(ds); 
            return;}
    for(int i=0;i<arr.size();i++){
        if(!freq[i]){
          ds.push_back(arr[i]);
          freq[i] =true;
           func(freq, arr, ds,ans);
           ds.pop_back();
           freq[i] =false;}
    }
    }

     vector<vector<int> >permulate(vector<int> arr)
    {    
        vector<vector<int> >ans ;
        vector<int> ds; 
        vector<bool> freq(arr.size(),false);
        func(freq, arr, ds,ans);
        return ans;
    }
int main(){
   //https://leetcode.com/problems/permutations/
    vector<int> arr={3,1,2};
     vector<vector<int> >ans2  =permulate(arr);    
    for(auto i:ans2){
         for(auto j:i){
              cout<<j;
         }
        cout<<endl;
      
    }
    return 0;
}