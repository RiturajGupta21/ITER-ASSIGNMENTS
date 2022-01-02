# include <stdio.h>
int linear_search(const int arr[], int target, int n);
int main(){
int i,n,target,pos;
printf("Enter The Length Of An Array: ");
scanf("%d",&n);
int arr[n];
printf("Enter %d Numbers In An Array:\n",n);
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
printf("Enter The Value To Be Searched: ",n);
scanf("%d",&target);
pos=linear_search(arr,target,n);
if(pos==-1)
printf("Search Unsucessful\n");
else
printf("Search Sucessful, Position: %d\n",pos);
return 0;
}
int linear_search(const int arr[], int target, int n){
int i;
for(i=0;i<n;i++)
{
if(arr[i]==target)
return i;
}
return -1;
}