#include <bits/stdc++.h>
#include <cstddef>
using namespace std;
struct node{
    int data;
    node * next;
    node (int n)
    {
        this->data = n;
        this->next = NULL;
    }
};
struct stack{
    struct node * start;
    void push(int data){
        if(start == NULL)
            start = new node(data);
        node * ptr = new node(data);
        ptr->next = start;
        ptr = start;
    }

}obj;
int main()
{
    return 0;
}
