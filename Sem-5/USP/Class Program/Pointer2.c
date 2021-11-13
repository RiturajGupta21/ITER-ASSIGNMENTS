/*
Prgrammer: Rituraj Gupta
Date completed: 09/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h>
int main(){
    int m = 10, n = 5; 
    int *mp, *np; 
    mp = &m; 
    np = &n; 
    *mp = *mp + *np; 
    *np = *mp - *np; 
    printf("%d %d\n%d %d\n", m, *mp, n, *np); 
}