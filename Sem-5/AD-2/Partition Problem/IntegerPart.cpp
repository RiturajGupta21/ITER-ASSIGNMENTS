#include <bits/stdc++.h>
using namespace std;
int main ()
{
    int n;
    const int INF = INT_MAX;
    cout << "Enter the number of elemnets to be in set -> ";
    cin >> n;
    vector<int> s(n + 1);
    for(int i = 1; i <= n; i++){
    cout << "Enter the "<<i<<"th elemnet of set -> ";
        cin >> s[i];
    }
    vector<int> p(n + 1, 0);
    for(int i = 1; i <= n; i++)
        p[i] = p[i - 1] + s[i];
    int k;
    cout << "Enter the number of partion -> ";
    cin >> k;
    vector<vector<int> > m(n + 1);
    for(int i = 0; i <= n; i++)
        m[i].resize(k + 1);
    for(int j = 0; j <= k; j++)
        m[0][j] = 0;
    for(int i = 1; i <= n; i++)
        m[i][1] = m[i - 1][1] + s[i];
    for(int i = 1; i <= n; i++)
        for(int j = 2; j <= k; j++)
        {
            m[i][j] = INF;
            for(int x = 1; x <= i; x++)
                m[i][j] = min(m[i][j], max(m[i - x][j - 1], p[i] - p[i - x]));
            cout <<"Value of -> m["<<i<<"]["<<j<<"] = "<< m[i][j] << endl;
        }
    return 0;
}