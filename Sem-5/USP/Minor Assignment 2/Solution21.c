#include <stdio.h>
void getchecksum(int sum, int *checksum);
void calc(char ch){
    int sum, checksum;
    sum = (int)'.';
    sum += (int)ch;
    scanf(" %c", &ch);
    while (ch != '.'){
        sum += ((int)ch);
        scanf(" %c", &ch);
    }
    getchecksum(sum, &checksum);
    printf("checksum - %c (%d)\n", (char)checksum, checksum);
    scanf(" %c", &ch);
    if (ch != '.')
        calc(ch);
}
void getchecksum(int sum, int *checksum){
    sum%=64;
    *checksum=sum+(int)' ';
}
int main(){
    char c;
    scanf(" %c",c);
    calc(c);
}