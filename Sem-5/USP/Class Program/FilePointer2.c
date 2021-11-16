/*
Prgrammer: Rituraj Gupta
Date completed: 16/11/2021
Instructor Dr. T.N.Pandey
Class 5th CSE,Sec-L
Registration Number: 1941012660
*/
#include <stdio.h> 
int main(){
    FILE *inp; /* pointer to input file */ 
    FILE *outp; /* pointer to ouput file */ 
    double item; 
    int input_status; /* status value returned by fscanf */ 
    /* Prepare files for input or output */ 
    inp = fopen("indata.txt", "r");
    outp = fopen("outdata1.txt", "w"); 
    /* Read each item, format it, and write it */ 
    input_status = fscanf(inp, "%lf", &item); 
    int count=0;
    while (input_status == 1) { 
        count++;
        fprintf(outp, "%.2f\n", item); 
        input_status = fscanf(inp, "%lf", &item); 
    } 
    fprintf(outp, "%d\n", count); 
    /* Close the files */ 
    fclose(inp); 
    fclose(outp); 
    return (0);
}