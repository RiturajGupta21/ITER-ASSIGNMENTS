#include <stdio.h>
#include <math.h>
#define SIZE 9
int main(){
    float inp_arr[SIZE];
    float res[SIZE];
    float mean,standardeviation,sum=0,standardeviationsum;
    int i;
    printf("Maximum elements that can be entered = %d\n\n",SIZE);
    printf("Enter the items \n");
    for(i=0;i<SIZE;i++){
        printf("Enter item %d -> ",i+1);
        scanf("%f",&inp_arr[i]);
    }
    for(i=0;i<SIZE;i++){
        sum+=inp_arr[i];
    }
    mean=sum/(float)SIZE;
    for(i=0;i<SIZE;i++){
        standardeviationsum+=pow((inp_arr[i]-mean),2);
    }
    standardeviation=sqrt(standardeviationsum/(float)SIZE);
    for(i=0;i<SIZE;i++){
        res[i]=inp_arr[i]-mean;
    }
    printf("Mean of all items = %.2f\n\n",mean);
    printf("Standard Deviation of all items  = %.2f\n\n",standardeviation);
    printf("-----------------------------------------------------------------------\n");
    printf("Index\tItem\tDiffernce\n");
    for(i=0;i<SIZE;i++){
        printf("%d\t%.2f\t%.2f\n",i+1,inp_arr[i],res[i]);
    }
}