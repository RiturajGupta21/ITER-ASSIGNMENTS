import java.util.Scanner;
public class A3qno2 {
	public static String process(String s) { 
        char[] ch = s.toUpperCase().toCharArray();
        char char1 = ch[0];
        for (int i = 0;i<ch.length;i++) {
            switch (ch[i]) {
                case 'B':
                case 'F':
                case 'P':
                case 'V':
                    ch[i] = '1';
                    break;
                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
                    ch[i] = '2';
                    break;
                case 'D':
                case 'T':
                    ch[i] = '3';
                    break;
                case 'L':
                    ch[i] = '4';
                    break;
                case 'M':
                case 'N':
                    ch[i] = '5';
                    break;
                case 'R':
                    ch[i] = '6';
                    break;
                default:
                    ch[i] = '0';
                    break;
            }
        }
        String str =""+char1;
        for (int i = 1; i < ch.length; i++)
            if (ch[i] != ch[i-1] && ch[i] != '0')
                str += ch[i];
        str+="0000";
        return str.substring(0, 4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	String name = sc.nextLine();
        System.out.println(process(name)+ ": " + name);
    }
}