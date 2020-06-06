import java.util.*;
public class A6qno1 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter two numbers for calculations ");
int x = sc.nextInt();
int y = sc.nextInt();
int res1 = additionSimple(x,y);
System.out.println("Addition result ="+res1);
int res2 = subtractionSimple(x,y);
System.out.println("Subtraction result = "+res2);
int res3 = multiplicationSimple(x,y);
System.out.println("Multiplication result = "+res3);
double res4 = divisionSimple(x,y);
System.out.println("Division result = "+res4);
int res5 = remainderSimple(x,y);
System.out.println("Remainder result "+res5);
double res6 = squareRootSimple(x);
System.out.println("Square Root Result = "+res6);}
public static int additionSimple(int x, int y){
return x+y;}
public static int subtractionSimple(int x, int y){
return x-y;}
public static int multiplicationSimple(int x, int y){
return x*y ;}
public static double divisionSimple(int x, int y){
return x/y;}
public static int remainderSimple(int a, int b){
return a%b;}
public static double squareRootSimple(int n){
double root = Math.sqrt(n);
return root;}}
