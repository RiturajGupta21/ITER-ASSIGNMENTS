public class A5qno23{
public static void main(String[] args){
int n =Integer.parseInt(args[0]);
int i=1;
for(i=2;i<=n;i++){
int p = PrimeCounter(i);
if(p!=0)
System.out.print(p+"   ");
if(p==0)continue;}}
public static int PrimeCounter(int a){
int i=1,cnt=0;
for(i=1;i<=a;i++){
if(a%i==0)
cnt=cnt+1;}
if(cnt==2)
return(a);
else 
return(0);}}
