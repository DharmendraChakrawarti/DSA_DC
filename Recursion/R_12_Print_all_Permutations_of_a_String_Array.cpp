#include<iostream>
#include<bits/stdc++.h>
using namespace std;

    void func(int index, vector<int> &arr,   vector<vector<int> >&ans ) {
      if(index == arr.size()){
          ans.push_back(arr);
          return;
      }
      for (int i = index; i < arr.size(); i++)
      {
          swap(arr[i], arr[index]);
          func(index+1,arr,ans);
            swap(arr[i], arr[index]);
      }
    }

     vector<vector<int> >permulate(vector<int> arr)
    {    
        vector<vector<int> >ans ;
        func(0, arr, ans);
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