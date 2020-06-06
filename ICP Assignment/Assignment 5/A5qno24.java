import java.util.*;
public class A5qno24{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int a,b,c,d;
for(a=1;a<n;a++){
for(b=1;b<n;b++){
if(a==b)
continue;
for(c=1;c<n;c++){
if(c==a||c==b)
continue;
for(d=1;d<n;d++){
if(d==a||d==b||d==c)
continue;
if(((a*a*a)+(b*b*b))==((c*c*c)+(d*d*d)))
System.out.println(a+" "+b+" "+c+" "+d+" ");}}}}}}