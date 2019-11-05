/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.
Array rotation by 1
12345
51234
*******************************************************************************/

#include <iostream>

using namespace std;

void rotate(int arr[], int size){
    int temp = arr[size-1];
    for(int i= size-1;i>=1;i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0]=temp;
}

void main()
{
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int size = sizeof(arr)/sizeof(arr[0]);
    rotate (arr,size);
    for(int i=0;i<size;i++)
    {
        cout << arr[i] << ",";
    }
}