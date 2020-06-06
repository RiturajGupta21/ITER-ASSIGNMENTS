public class A6qno7{
public static void main(String[] args) {
int i =2 ;
for(i=2;i<999;i++){
boolean  p = isPrime(i);
boolean q = isPrime(i+2);
if(p==true&&q==true){
System.out.println("("+i+" , "+(i+2)+")"); }}}
public static boolean isPrime(int a ){
int b = a , j=2 , flag = 0;
for(j=2;j<=b/2;j++){
if(b%j==0){
flag = 1;
break;}}
if(flag == 0)
return true;
else 
return false;}}