#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void cj(vector<int> &arr)
{
    int i = 0;
    while (i < arr.size())
    {
        int current = arr[i] - 1;
        if (arr[i] != arr[current])
        {
            swap(arr[i], arr[current]);
        }
        else
        {
            i++;
        }
    }
}
int main()
{

    //https://leetcode.com/problems/find-the-duplicate-number/
    vector<int> arr = {3, 5, 2, 1, 4};
    cj(arr);
    for (int i:arr)
    {
        cout << i << " ";
    }
    return 0;
}