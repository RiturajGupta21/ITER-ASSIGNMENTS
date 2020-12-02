public class A2qno24 {
public static void main(String[] args) {
double a=Math.random();
double b=Math.random();
double c=Math.random();
double d=Math.random();
double e=Math.random();
double average=(a+b+c+d+e)/5;
double max=Math.max(a, b);
double max1=Math.max(max, c);
double max2=Math.max(max1, d);
double max3=Math.max(max2, e);
double min=Math.min(a, b);
double min1=Math.min(min, c);
double min2=Math.min(min1, d);
double min3=Math.min(min2, e);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println("Average value ="+average+" max value"+max3+" min value"+min3);
}
}
