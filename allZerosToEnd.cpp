#include <iostream>
using namespace std;
void printArray(int arr[], int size)
{
    for(int i=0;i<size;i++)
        cout << arr [i] << "," ;
}
void moveZeros(int arr[],int size){
    int count=0;
    for (int i = 0; i < size; i++)
        if (arr[i] != 0)
            swap(arr[count++], arr[i]);
}
int main(){
    int arr[] = {1,2,0,0,3,4,0,5,6,0,0,7,8};
    int size = sizeof(arr)/sizeof(arr[0]);
    cout << "Before : ";
    printArray(arr,size);
    cout << "\nAfter : ";
    moveZeros(arr,size);
    printArray(arr, size);
    cout<<"\n";
    return 0;
}
