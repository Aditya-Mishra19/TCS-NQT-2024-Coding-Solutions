#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    vector<string> ans;
    int totalFemale = 0, totalGrade = 0;
    while(n--) {
        string name, gender;
        char grade;
        int age;
        cin >> name >> age >> grade >> gender;

        if(age > 20)
            cout << name << endl;
        
        if (gender == "Female") {
            totalFemale++;
            totalGrade += grade; 
        }
    }
    double avg = (double) (totalGrade / totalFemale);
    cout << avg << endl;
    
}