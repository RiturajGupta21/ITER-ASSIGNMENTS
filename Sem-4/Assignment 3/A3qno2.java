import java.util.*;
public class A3qno2 {
	public static String base(String str,int base1,int base2) {
		int end=0;
		if(str.charAt(0)=='-')
			end=1;
		int num=0,c=0;
		char ch;
		for(int i=str.length()-1;i>=end;i--) {
			ch=str.charAt(i);
			if (Character.isDigit(ch))
				num=num+(((int)(Math.pow(base1,c)))*(ch-'0'));
			else
				num=num+(((int)(Math.pow(base1,c)))*(ch-'A'+10));
			c=c+1;
		}
		if(end==1)
			num=-num;
		if(num==0)
			return ("0");
		int r;
		String res="";
		int tmp=num;
		if (num<0)
			tmp=-tmp;
		while(tmp!=0){
			r=tmp%base2;
			if(r<10)
				res=r+res;
			else
				res=(char)('A'+(r-10))+res;
			tmp = tmp / base2;
		}
		if (num<0)
			return ("-" + res);
		return (res);
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
	    String str=sc.nextLine();
		System.out.println("Enter The Base 1 Value");
		int base1=sc.nextInt();
		System.out.println("Enter The Base 2 Value");
		int base2=sc.nextInt();
		System.out.println(base(str,base1,base2));
	}

}
