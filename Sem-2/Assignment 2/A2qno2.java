import java.util.Scanner;
class Complex
{
	double real,imag;
	void setData(double r,double i)
	{
		real=r;
		imag=i;
	}
	void display()
	{
		System.out.print(real+" ");
		if(imag>=0)
			System.out.println("+"+imag+"i");
		else
			System.out.println(imag+"i");
	}
	public Complex add(Complex ob1,Complex ob2)
	{
		Complex ob3=new Complex();
		ob3.real=ob1.real+ob2.real;
		ob3.imag=ob1.imag+ob2.imag;
		return(ob3);
	}
}
public class A2qno2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Complex ob1=new Complex();
		Complex ob2=new Complex();
		Complex ob3=new Complex();
		System.out.println("Enter 1st Complex Numner ,real and imaginary part respectively:-");
		double r1=sc.nextDouble();
		double i1=sc.nextDouble();
		ob1.setData(r1, i1);
		System.out.println("Enter 2nd Complex Numner ,real and imaginary part respectively:-");
		double r2=sc.nextDouble();
		double i2=sc.nextDouble();
		ob2.setData(r2, i2);
		System.out.print("1st Complex Number:=");
		ob1.display();
		System.out.print("2nd Complex Number:=");
		ob2.display();
		System.out.print("Sum of two Complex Number:=");
		ob3=ob3.add(ob1, ob2);
		ob3.display();
	}
}
