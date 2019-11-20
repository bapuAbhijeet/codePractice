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
void primeFactors(int n)
{
     while (n % 2 == 0)  
    {  
        cout << 2 << " ";  
        n = n/2;  
    } 
    for (int i = 3; i <= sqrt(n); i = i + 2)  
    {  
         while (n % i == 0)  
        {  
            cout << i << " ";  
            n = n/i;  
        }  
    } 
    if (n > 2)  
        cout << n << " ";
}
void getUglyNumbers(int n)
{
    int i=1;
    while(i<n)
    {
        if(isUgly(i))
        {  
            cout << i << "=" ;
            primeFactors(i);
            cout <<"\n";
        }
        else
        {
        cout << i << "=" ;
        primeFactors(i);
        cout <<"\n";
        }
        i++;
    }
}
int main()
{
    getUglyNumbers(100);
    return 0;
}