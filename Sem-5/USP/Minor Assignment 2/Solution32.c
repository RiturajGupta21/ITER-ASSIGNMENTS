# include <stdio.h>
void display(int arr[],int n){
int i;
for(i=0;i<n;i++)
printf("%d ",arr[i]);
printf("\n");
}
void bubble_sort(int arr[],int n){
int i,j,temp;
for(i=0;i<n-1;i++){
for(j=0;j<(n-i-1);j++){
if(arr[j]>arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
printf("Final Array: ");
display(arr,n);
}
int main(){
int i,n;
printf("Enter The Number Of Element In An Array: ");
scanf("%d",&n);
printf("Enter %d Numbers In An Array:\n",n);
int arr[n];
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
printf("Original Array: ");
display(arr,n);
bubble_sort(arr,n);
return 0;
}