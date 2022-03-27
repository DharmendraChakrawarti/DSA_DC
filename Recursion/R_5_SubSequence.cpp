#include<iostream>
#include<bits/stdc++.h>
using namespace std;
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
    printF(vec,arr,3,0);
    return 0;
}