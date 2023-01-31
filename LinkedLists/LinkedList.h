#ifndef LINKED_LIST_H
#define LINKED_LIST_H
#include <stdio.h>
#include "Node.h"

class LinkedList{
    //usually not a good idea to make everything public but I wanted to in this case for easier debugging terminal
    public:
        Node *head;
        LinkedList(int value);
        void addFirst(int value);
        void addLast(int value);
        void deleteFirst();
        void deleteLast();
        bool contains(int value);
        int indexOf(int value);
        void printList();
};

#endif