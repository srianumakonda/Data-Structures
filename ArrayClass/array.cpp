#include "array.h"
// #include <iostream>
void ArrayClass::ArrayClass(int len){
    arrLength = len;
    extern int arrayValues = int[arrLength];
}
void ArrayClass::insert(int val){
    arrayValues[idxAdder] = val;
    ++idxAdder;
    if (idxAdder==length) throw std::out_of_range ("Array Filled Up");
}
void ArrayClass::removeAt(int indexVal){
    arrayValues[indexVal] = 0;
    for (unsigned int i=indexVal;i<length-1;i++){
        arrayValues[i] = arrayValues[i+1];
    }
}
int ArrayClass::indexOf(int val){
    for (unsigned int i=0;i<length-1;i++){
        if(arrayValues[i]==val) return i else return -1;
    }
}