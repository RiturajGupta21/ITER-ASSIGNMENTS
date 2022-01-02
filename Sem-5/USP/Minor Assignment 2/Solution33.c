# include <stdio.h>
# include <stdbool.h>
int binary_search(const int arr[], int target, int n);
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
pos=binary_search(arr,target,n);
if(pos==-1)
printf("Search Unsucessful.\n");
else
printf("Search Sucessful, Position: %d\n",pos);
return 0;
}
int binary_search(const int arr[], int target, int n){
bool found=false;
int bottom,top,middle;
bottom=0;
top=n-1;
while(bottom<=top){
middle=(bottom+top)/2;
if(arr[middle]==target){
found=true;
break;
}
else if(arr[middle]>target)
top=middle-1;
else
bottom=middle+1;
}
if(found)
return middle;
else
return -1;
}