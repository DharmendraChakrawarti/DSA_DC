#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool issaf(int row, int col, vector<vector<char>> &ans, char c)
{
    for (int i = 0; i < 9; i++)
    {
        if (ans[i][col] == c)
            return false;
        if (ans[row][i] == c)
            return false;
        if (ans[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
            return false;
    }
    return true;
}
bool solve(vector<vector<char>> &ans)
{
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[0].size(); j++)
        {
            if (ans[i][j] == '.')
            {
                for (char c = '1'; c <= '9'; c++)
                {
                    if (issaf(i, j, ans, c))
                    {
                        ans[i][j] = c;
                        if (solve(ans))
                        {
                            return true;
                        }
                        else
                            ans[i][j] = '.';
                    }
                }
                return false;
            }
        }
    }
    return true;
}

void sudoku(vector<vector<char>> &ans)
{
    solve(ans);
}
int main()
{
    // https://leetcode.com/problems/sudoku-solver/
    vector<vector<char>> ans(9, vector<char>(9, '.'));
    sudoku(ans);
    for (auto i : ans)
    {
        for (auto j : i)
        {
            cout << j << " ";
        }
        cout << endl;
    }
    return 0;
}