import java.util.*;
public class A6qno12{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);  
System.out.println("Enter the String or sentence to be inputed ");
String s = sc.nextLine();
int cnt = count(s);
System.out.println("The number of vowels are = "+cnt); }
public static int count (String st ){
int cnt = 0 ;
for(int i =0 ; i<st.length();i++){
if(st.charAt(i)=='a' ||st.charAt(i)=='e' ||st.charAt(i)=='i' ||st.charAt(i)=='o' ||st.charAt(i)=='u'||st.charAt(i)=='A' ||st.charAt(i)=='E' ||st.charAt(i)=='I' ||st.charAt(i)=='O'||st.charAt(i)=='U')
cnt ++;}
return cnt;}}