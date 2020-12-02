import java.util.*;
public class A3qno12 {
public static int search(int arr[],int m,int n,int s) {
	if(n>=m) {
		int i=m+(n-m)/2;
		if(arr[i]==s) {
			return i;}
			if(arr[i]>s) {
				return search(arr,m,i-1,s);
			}
			else {
				return search(arr,i+1,n,s);
		}
	}
	return -1;
}
public static void main(String args[]) {
	int arr[]= {10,20,30,40,50,60};
	int s=30;
	int res=search(arr,0,arr.length-1,s);
	if(res==-1)
		System.out.println("Number not found");
	else System.out.println("Number found at "+(res+1) );
}
}
