import java.util.*;
public class A2qno13 {
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter the minutes");
long m=s.nextLong();
long days=m/(24*60);
long year =days/365;
days=days%365;
System.out.println(m+" minutes is approximately "+year+" years "+days+(" days"));
}
}
