#include <bits/stdc++.h>
using namespace std;
int maxDivide(int a, int b) 
{ 
  while (a%b == 0) 
   a = a/b;  
  return a; 
}     
  
/* Function to check if a number is ugly or not */
int isUgly(int no) 
{ 
  no = maxDivide(no, 2); 
  no = maxDivide(no, 3); 
  no = maxDivide(no, 5); 
    
  return (no == 1)? 1 : 0; 
} 
void getUglyNumbers(int n)
{
    int i=1;
    while(i<n)
    {
        if(isUgly(i))
            cout << i << "\n";
        i++;
    }
}
int main()
{
    getUglyNumbers(100);
    return 0;
}