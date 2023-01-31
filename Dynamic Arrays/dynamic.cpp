#include <iostream>
#define LENGTH 1000
using namespace std;

int main(){
    int *dynArray;
    dynArray = new int[LENGTH]; //use new keyword to define dynamic array
    dynArray[0] = 1;
    dynArray[1] = 2;
    dynArray[2] = 3;

    cout << "Array: ";
    for (unsigned int i=0;i<sizeof(dynArray);i++){
        cout << dynArray[i] << " ";
    }

    delete [] dynArray;
    
    return 0;
}