#include<iostream>
#include <bits/stdc++.h>
using namespace std;
 bool isPalindrome(string s, int start, int end) {
        while(start <= end) {
            if(s[start++] != s[end--])
                return false;
        }
        return true;
    }
void help(string s,vector<vector<string>> &ans,vector<string> &ds,int index){
    if(index ==s.size()){
        ans.push_back(ds);
        return;
    }
    for(int i=index; i < s.size(); i++){
        if(isPalindrome(s,index,i)){
               ds.push_back(s.substr(index, i - index + 1));
                help (s, ans,ds,i+1);
                ds.pop_back();
        }
    }
}
 vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> ds;
        help(s,ans,ds,0);
        return ans;
    }
int main(){
   // https://leetcode.com/problems/palindrome-partitioning/
   string   s = "aab";
   vector<vector<string>>ans= partition(s);
    for (auto i : ans)
    {
        for (auto j : i)
        {
            cout << j<<" ";
        }
        cout << endl;
    }
       return 0;
}