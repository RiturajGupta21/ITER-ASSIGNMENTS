import java.util.Scanner;
public class A3qno4 {
	   public static void main(String[] args) {  
		   Scanner sc=new Scanner(System.in);
	        String str = sc.nextLine();  
	        int[] arr = new int[str.length()];    
	        char arr1[] = str.toCharArray();  
	        for(int i = 0;i<str.length();i++) {  
	            arr[i] = 1;
	            for(int j = i+1;j<str.length();j++) {  
	                if(arr1[i]==arr1[j]) {  
	                    arr[i]++;  
	                    arr1[j] = '0';  
	                }  
	            }  
	        }  
	        for(int i = 0; i <arr.length; i++) {  
	            if(arr1[i] !=' '&&arr1[i]!='0')  
	                System.out.println("Frequency of "+arr1[i] + "-" + arr[i]);  
	            }
	        }
	   }
