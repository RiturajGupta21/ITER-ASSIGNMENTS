import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class A3qno11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String str1="";
		char ch;
		for(int i=0;i<str.length();i++){
		ch=str.charAt(i);
		if(ch=='1')
			str1=str1+"One";
		else if(ch=='2')
			str1=str1+"Two";
		else if(ch=='3')
			str1=str1+"Three";
		else if(ch=='4')
			str1=str1+"Four";
		else if(ch=='5')
			str1=str1+"Five";
		else if(ch=='6')
			str1=str1+"Six";
		else if(ch=='7')
			str1=str1+"Seven";
		else if(ch=='8')
			str1=str1+"Eight";
		else if(ch=='9')
			str1=str1+"Nine";
		else
			str1=str1+ch;
		}
		System.out.println(str1);
		}
	}