#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[] = {10,20,30,40,50,60,70,80};
    int f=0,s=0,t=0;
    int n = sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n;i++)
    {
        if(arr[i] > f)
            {
                t=s;s=f;f=arr[i];
            }
        else if(arr[i] > s)
            {
                t=s;s=arr[i];
            }
        else if (arr[i] > t) {
            t = arr[i];
        }
    }
    cout << f << "\t "<<s<< "\t "<<t<< "\t ";
}