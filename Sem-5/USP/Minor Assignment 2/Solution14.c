#include<stdio.h>
int main(){
    int m = 25, n = 77;
    char c = '*';
    int *itemp;
    m = &n;
    itemp = m;
    *itemp = c;
    *itemp = &c;
}