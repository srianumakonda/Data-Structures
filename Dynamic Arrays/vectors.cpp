#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
    vector<int> testIntegers;
    testIntegers.push_back(1);
    for (int& i : testIntegers) cout << i << endl;

    // testIntegers.clear() -> clears the array
    return 0;
}