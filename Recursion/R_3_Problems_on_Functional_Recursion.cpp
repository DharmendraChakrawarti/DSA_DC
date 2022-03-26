#include<iostream>
using namespace std;
void pallendrome(int arr[],int i,int j){
	if(i>=j){ return;}
	swap(arr[i],arr[j]);
	pallendrome(arr,i+1,j-1);
}

bool pall_fun(string &st,int i){
	if(i>=st.size()/2)return true;
	if(st[i]!=st[st.size()-1-i]) return false;
	pall_fun(st,i-1);
}
int main(){
	// int arr[]={2,2,2,2,2,2};
	// int arr2[6];
	// for(int i=0;i<6;i++){
	// 	arr2[i]=arr[i];
	// }
	// pallendrome(arr, 0,5);
	// bool flag=true;                                     //parameteraised
	// for(int i=0;i<6;i++){
	// 	if(arr[i]!=arr2[i]){
	// 		flag=false;
	// 		break;
	// 	}
	// }
	// if(flag){cout<<"pallen";}
	// else cout<<"not pall";

	string st={"dcpower"};
	cout<<pall_fun(st,0);
	return 0;
}