#include<bits/stdc++.h>
using namespace std;
vector<int> edges[100001];
vector<vector<int>> components;
vector<int> component;
 
void dfs(int start, bool* visited)
{
    visited[start] = true;
    component.push_back(start);
    for(int i=0;i<edges[start].size();i++)
    {
        int adj=edges[start][i];
        if(!visited[adj])
        {
            dfs(adj,visited);
        }
    }
}
void findComponents(int n)
{
    bool* visited=new bool[n]();
    for(int i=0;i<n;i++)
    {
        if(!visited[i])
        {
            component.clear();
            dfs(i,visited);
            components.push_back(component);
        }
    }
    delete[] visited;
}
int main()
{
    //code
    int t;
    cin>>t;
    while(t--)
    {
        int n,e;
        cin>>n>>e;
        for(int i=0;i<n;i++)
        {
            edges[i].clear();
        }
        while(e--)
        {
            int x,y;
            cin>>x>>y;
            x--;
            y--;
            edges[x].push_back(y);
            edges[y].push_back(x);
        }
        long long bananas[n];
        for(int i=0;i<n;i++)
        {
            cin>>bananas[i];
        }
        findComponents(n);
        /*for(int i=0;i<components.size();i++)
        {
            for(int j=0;j<components[i].size();j++)
            {
                cout<<components[i][j]<<" ";
            }
            cout<<endl;
        }*/
        long long maxsum=0;
        for(int i=0;i<components.size();i++)
        {
            long long sum=0;
            for(int j=0;j<components[i].size();j++)
            {
                sum+=bananas[components[i][j]];
            }
            maxsum=max(sum,maxsum);
        }
        cout<<maxsum<<endl;
        components.clear();
       
    }
    return 0;
}