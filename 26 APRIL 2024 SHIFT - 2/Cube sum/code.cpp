#include <iostream>

using namespace std;

void findCubeSum(int start, int end) {
    int cubeSum = 0;
    for (int i = start; i <= end; i++) {
        cubeSum += i * i * i;
    }
    cout << cubeSum << endl;
}

int main() {
    int start, end;
    cin >> start >> end;
    findCubeSum(start, end);
    return 0;
}
