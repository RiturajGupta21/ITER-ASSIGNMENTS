public class A6qno5{
public static void main(String[] args) {
int  i =3 , cnt = 1 ;
for(i=3;i<10000;i=i+2){
boolean j = isPrime(i);
if (j==true)
cnt = cnt+1;}
System.out.println("The number of prime numbers = "+cnt);}
public static boolean isPrime(int x){
int i =3 , c = 0;
for (i=3;i*i<=x;i++){ 
if (x%i==0){
c = 1;
break;}}
if(c==1)
return false;
else 
return true;}}