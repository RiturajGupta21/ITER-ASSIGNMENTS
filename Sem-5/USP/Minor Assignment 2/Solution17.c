#include<stdio.h>
void sum_n_avg(double inp1,double inp2,double inp3,double *sum,double *avg);
int main(){
    double one, two, three, sum_of_3, avg_of_3;
    printf("Enter three numbers> ");
    scanf("%lf%lf%lf", &one, &two, &three);
    sum_n_avg(10,20,30,&sum_of_3,&avg_of_3);
    printf("%lf %lf",sum_of_3,avg_of_3);
}
void sum_n_avg(double inp1,double inp2,double inp3,double *sum,double *avg){
    *sum=inp1+inp2+inp3;
    *avg=*sum/3;
}
