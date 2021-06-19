import java.util.*;
public class A3qno4 {
	public static int removeElement(char[] arr) {
		int length = arr.length,c=0,a=0; 
		for (int i = 0;i<length;i++){
			if (arr[i]!='b')
				arr[c++]=arr[i];
			if (arr[i]=='a')
				a++;
		}
		int cp=c-1;
		c+=a-1;
		int size=c+1;
		while (cp>-1) {
			if (arr[cp]=='a') {
				arr[c--]='d';
				arr[c--]='d';
			}
			else
				arr[c--]=arr[cp];
			cp--;
		}
		return size;
	}
	public static void main(String[] args) {
		char [] arr= {'a','c','d','b','b','b','b','c'};
		System.out.println("Before Removal and Replacing");
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
		System.out.println("\nSize "+removeElement(arr));
		System.out.println("After Removal and Replacing");
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
	}

}
