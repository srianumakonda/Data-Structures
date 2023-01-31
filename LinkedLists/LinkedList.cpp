#include "LinkedList.h"
#include "Node.h"
#include "Node.cpp"
#include <stdio.h>
#include <iostream>
using namespace std;

LinkedList::LinkedList(int value){
    head->value = value;
}


void LinkedList::addFirst(int value){
    Node *temp = head;
    Node *newhead = new Node();
    newhead->value = value;
    newhead->next = temp;
    head = newhead;
}

void LinkedList::addLast(int val){
    Node *current = head;
    Node *nodeVal = new Node();
    nodeVal->value = val;
    while(current->next!=NULL){
        current = current->next; 
    }
    current->next = nodeVal;
}

// bool LinkedList::contains(int value){
//     bool isFound=false;

//     return false;
// }
// int LinkedList::indexOf(int value){

// }

void LinkedList::printList(){
    Node *current = head;
    while(current->next!=NULL){
        cout << current->value << endl;
        current = current->next; 
        if(current->next==NULL){
            cout << current->value << endl;
        }
    }
}