#include "Node.h"
#include "LinkedList.h"
#include "LinkedList.cpp"
#include <iostream>
#include <string>
#include <stdio.h>

using namespace std;

int main(){

    LinkedList x = LinkedList(10);
   
    // ADDITION OPERATIONS 
    x.addLast(20);
    x.addLast(30);
    x.addLast(40);
    x.addLast(50);
    x.addFirst(200);
    // // DELETION OPERATIONS
    // x.deleteFirst();
    // x.deleteLast();

    // // CHECKING OPERATIONS
    // x.contains(50);
    // x.indexOf(20);

    // cout << x.head->value << endl;
    x.printList();
    // cout << x.head->next->value << endl;
    return 0;
}