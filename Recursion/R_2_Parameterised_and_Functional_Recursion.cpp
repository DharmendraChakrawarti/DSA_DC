#include<iostream>
using namespace std;

void parameterised(int n,int sum){
	if(n==0){
		cout<<sum;
		return;
}
parameterised(n-1,sum+n);
}

int fuctional_rec(int n){
	if(n==0){
		return 0;
	}
	return n+fuctional_rec(n-1);
}

// factorial
int factorial(int n){
	if(n==0){return 1;}
return n*factorial(n-1);
}
int main(){
	// parameterised(8,0);       // parameterised recursion
	//cout<<fuctional_rec(8);               //functional recurtion
     cout<< factorial(3);
	return 0;
}