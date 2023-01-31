#include "Node.h"
#include "LinkedList.h"
#include <iostream>
#include <string>

using namespace std;

int main(){

    LinkedList x = LinkedList(10);
    
    // ADDITION OPERATIONS 
    x.addLast(20);
    x.addLast(30);
    x.addLast(40);
    x.addLast(50);
    x.addFirst(0);
    
    // DELETION OPERATIONS
    x.deleteFirst();
    x.deleteLast();

    // CHECKING OPERATIONS
    x.contains(50);
    x.indexOf(20);

    return 0;
}