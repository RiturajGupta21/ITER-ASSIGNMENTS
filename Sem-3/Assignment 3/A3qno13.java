import java.util.Scanner;
public class A3qno13 {
	public static String process(String s) {
	    if(s==null || s.length()<=1)
	        return s;
	    int n=s.length();
	    int maxLen = 1;
	    boolean [][] boo = new boolean[n][n];
	    String str =null;
	    for(int l=0; l<s.length(); l++){
	        for(int i=0;i<n-l; i++){
	            int j = i+l;
	            if(s.charAt(i)==s.charAt(j)&&(j-i<=2||boo[i+1][j-1])){
	                boo[i][j]=true;
	                if(j-i+1>maxLen){
	                   maxLen = j-i+1; 
	                   str = s.substring(i, j+1);
	                }
	            }
	        }
	    }
	    return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(process(str));
		System.out.println(process(str).length());
	}

}
