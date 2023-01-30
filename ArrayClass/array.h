#ifndef ARRAY_H
#define ARRAY_H

class ArrayClass {
    private:
        int idxAdder=0;
        int arrLength;
        int value;
    public:
        ArrayClass(int arrLength);
        void insert(int val);
        void removeAt(int indexVal);
        int indexOf(int val);
};

#endif