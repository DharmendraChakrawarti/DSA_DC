#include<iostream>
using namespace std;
void print (int n){
	if(n==1){
		cout<<n;
		return;
	}
	//cout<<n;       //for reverse print
	print (n-1);
	cout<<n;       

}
int main(){
	int n=10;
	print(n);
	return 0;
}