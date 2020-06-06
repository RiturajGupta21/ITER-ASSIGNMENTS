public class A5qno18{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
int k = Integer.parseInt(args[1]);
double error = 0.000001;
double g2 = (double)n/2 , g1;
do {
g1 = g2 ;
g2 = ((k-1)*g1+(n/Math.pow(g1,k-1)))/k;}
while(Math.abs(g2-g1)>error);
System.out.println(k+" th root of "+n+" = "+g2);}}
