#ifndef _NODE_H
#define _NODE_H
#include <stdio.h>

class Node{
    public:
        int value;
        Node *next;
        Node(int value=0);
};

#endif