public class A2qno20 {
public static void main(String[] args) {
int m=Integer.parseInt(args[0]);
int d=Integer.parseInt(args[1]);
boolean s=((m==3&&d>=20&&d>=31)||(m==4&&d>=1&&d<=31)||(m==5&&d>=1&&d<=31)||(m==6&&d>=1&&d<=20))?true:false;
System.out.println(s);
}
}
