import java.util.*;
import java.util.regex.*;
class InvalidChassi extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidChassi(String s){
        super(s);
    }
}
public class A8qno3 {
	String chassis_num;
	String color;
	String maxSpeed;
	A8qno3(String chassis_num,String color,String maxSpeed){
		this.chassis_num=chassis_num;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void checkchassis_num(String num) throws InvalidChassi   {
		Pattern p=Pattern.compile("\\w{10}");
		Matcher m=p.matcher(num);
		if(m.matches()) {
			System.out.println(chassis_num+" "+color+" "+maxSpeed);
		}
		else {
			throw new InvalidChassi("Invalid input");
		}
	}
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		A8qno3 a=new A8qno3(num,"Red","100");
		try {
			a.checkchassis_num(num);	
		}
		catch(InvalidChassi i) {
			System.out.println(i);
		}
	}
}
