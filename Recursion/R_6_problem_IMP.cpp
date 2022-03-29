#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void printF(vector<int> &vec,int arr[],int n,int index,int sum,int a){
    if(index==n){
        if(a==sum){
        for(auto i:vec){
            cout<<i<<" ";
        }
        cout<<endl;
        }
        return;}
        //take or pick the element 
        vec.push_back(arr[index]);
        sum+=arr[index];
        printF(vec,arr,n,index+1,sum,a);
        vec.pop_back();
         sum-=arr[index];
        //to do not take element or remove
        printF(vec,arr,n,index+1,sum,a); 
}

bool printB(vector<int> &vec,int arr[],int n,int index,int sum,int a){
    if(index==n){
        if(a==sum){
        for(auto i:vec)
            cout<<i<<" ";
        return true;
        
        cout<<endl;
        }
      else return false;}
        //take or pick the element 
        vec.push_back(arr[index]);
        sum+=arr[index];
        if(printB(vec,arr,n,index+1,sum,a)==true){return true;}
        vec.pop_back();
         sum-=arr[index];
        //to do not take element or remove
        if(printB(vec,arr,n,index+1,sum,a)==true){return true;} 
        return false;
}

int printC(int arr[],int n,int index,int sum,int a){
    if(index==n){
        if(a==sum){
        return 1;
        }
        else return 0;
        }
        //take or pick the element 
      
        sum+=arr[index];
        int l=printC(arr,n,index+1,sum,a);
         sum-=arr[index];
        //to do not take element or remove
        int r=printC(arr,n,index+1,sum,a); 
        return r+l;
}
int main(){
    int arr[]={2,2,5};
    vector<int> vec;
    int a=2;       //to check that 4 is persent in arry in form of subsequence
    // printF(vec,arr,3,0,0,a);

    //cout<<printB(vec,arr,3,0,0,a);           //print true if value find or else

    cout<<printC(arr,3,0,0,a);
    return 0;
}