import java.util.*;
class Box<T>
{
	 T a ;
	 void add (T b)
	 {
		 a=b;
	 }
	 T getA()
	 {
		 return a;
	 }
}
public class A3qno4 {

	
	public static void main(String[] args) 
	{
		Box<String> b1 = new Box<String>();
		Box<String> b2 = b1 ;
		b1.add("ITER");
		System.out.println(b2.getA());
		
		Box<Integer> b3 = new Box<Integer>();
		Box<Integer> b4 = b3;
		b3.add(101);
		System.out.println(b4.getA());
		
		Box<Object> b5 = new Box<Object>();
		Box<Object> b6 = b5;
		b5.add(101);
		System.out.println(b6.getA());
		b5.add("Hi");
		System.out.println(b6.getA());
		
		
	}
	
	

}
