# include <stdio.h>
void f(int a[], int n, float y){
printf("The Length Of An Array: %d\n",n);
printf("Array: ");
for(int i=0;i<n;i++)
printf("%d ",a[i]);
printf("\n");
printf("Predicted Mean: %f\n",y);
}
int main(){
int i,n;
float y;
printf("Enter The Length Of An Array: ");
scanf("%d",&n);
printf("Enter %d Numbers In An Array:\n",n);
int arr[n];
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
printf("Enter The Value Of Mean Predicted: ");
scanf("%f",&y);
f(arr,n,y);
return 0;
}