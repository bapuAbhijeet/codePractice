#include <bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node* next;
};
void push(struct Node** head_ref, int new_data)
{
    struct Node* new_node = new Node;
    new_node->data = new_data;
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
}
void printList(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("%d->", ptr->data);
        ptr = ptr->next;
    }
    printf("NULL\n");
}
void middleList(struct Node *head){
    struct Node *slow_ptr = head;
    struct Node *fast_ptr = head;
    if(head != NULL)
    {
        while (slow_ptr != NULL && fast_ptr != NULL) {
            slow_ptr = slow_ptr->next;
            fast_ptr = fast_ptr->next->next;
        }
     cout << "Mid : " << slow_ptr->data;
    }
}
int main()
{
    struct Node* head = NULL;
    for(int i=0;i<5;i++)
    {
        push(&head,i);
        printList(head);
        middleList(head);
    }
    return 0;
}