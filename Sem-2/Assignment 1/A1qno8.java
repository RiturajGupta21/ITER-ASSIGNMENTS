import java.util.*;
class A1qno8{
int dp(int x, int y){
int d=x*y;
return d;
}
}
public class qno8{
public static void main(String[] args) {
dotproduct d=new dotproduct();
Scanner sc=new Scanner(System.in);
int i,n=sc.nextInt();
int a[]= new int[n];
int b[]= new int[n];
int c[]= new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
b[i]=sc.nextInt();
}
for(i=0;i<n;i++){
c[i]=d.dp(a[i],b[i]);
}for(i=0;i<n;i++){
System.out.println(c[i]);
}
}
}