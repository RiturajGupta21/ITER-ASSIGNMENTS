public class A2qno18 {
public static void main(String[] args) {
double a=Double.parseDouble(args[0]);
double b=Double.parseDouble(args[1]);
double c=Double.parseDouble(args[2]);
boolean s=(a>b&&a>c)?true:(c>b&&c>a)?true:false;
System.out.println(s);
}
}
