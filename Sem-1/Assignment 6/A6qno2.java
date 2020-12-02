public class A6qno2{
public static void main(String[] args) {
int cnt = 0 , i = 0 ;
for(i=1;i<=100;i++){
int call = getPentagonalNumber(i);
cnt = cnt+1;
System.out.print(call+"\t");
if (cnt%10==0)
System.out.println("\n");}}
public static int getPentagonalNumber(int n){
int j = n ;
int k = j*((3*j)-1)/2;
return k;}}
