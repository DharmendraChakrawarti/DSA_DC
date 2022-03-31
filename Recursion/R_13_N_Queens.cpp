#include<iostream>
#include <bits/stdc++.h>
using namespace std;
 bool issaf(vector<string> ds,int row,int col,int n){
     int coll=col;
     int roww=row;
     while(row>=0&&col>=0){
         if(ds[row][col]=='Q')return false;
         row--; col--;
     }
     col=coll;
     row=roww;
     while(col>=0){
         if(ds[row][col]=='Q')return false;
         col--;
     }
        col=coll;
     row=roww;
     while(col>=0&&row<n){
          if(ds[row][col]=='Q')return false;
col--;
row++;
     }
     return true;
 }
void solve(int col,vector<vector<string> >&ans,vector<string>&ds,int n){
     if(col==n){
         ans.push_back(ds);
        return;
     }
      for(int row=0;row<n;row++){
             if (issaf(ds,row,col,n))
             {
                 ds[row][col]='Q';
                 solve(col+1,ans,ds,n);
                  ds[row][col]='.';
             }
             
         }
}
vector<vector<string>> quenn(int n){
    vector<vector<string>> ans;
     vector<string> ds(n);
     string s(n,'.');
     for (int i = 0; i < n;i++){
       ds[i] = s;
     }
    solve(0,ans, ds,n);
    return ans;
}
int main(){
// https://leetcode.com/problems/n-queens/
    vector<vector<string>> ans= quenn(4);
     for(auto i:ans){
         for(auto j:i){
              cout<<j;
         }
        cout<<endl;
      
    }
    return 0;
}