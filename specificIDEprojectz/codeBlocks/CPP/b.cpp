// implementing private inheritance in cpp

#include<iostream>
using namespace std;

class A
{

public:
    int b;
protected:
    int c;
private:
    int a;


};

class B: private A
{
    void show()
    {
        cout<<b<<" "<<c<<" ";
    }
};
