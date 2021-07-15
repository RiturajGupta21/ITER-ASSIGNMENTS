public class A5qno2 {
	public static int RPN(String[] arr) {
        int[] narr=new int[arr.length];
        int i=0;
        for (String str:arr) {
            if (str.length()!=1||Character.isDigit(str.charAt(0)))
                narr[i++]=Integer.parseInt(str);
            else {
                i--;
                char ch=str.charAt(0);
                if (ch=='+')
                    narr[i-1]+=narr[i];
                else if (ch=='-')
                    narr[i-1]-=narr[i];
                else if (ch=='*')
                    narr[i-1] *=narr[i];
                else 
                    narr[i-1]/= narr[i];
            }
        }
        return narr[0];
    }
	public static void main(String[] args) {
		String arr[]= {"3","4","+","2","*","1","+"};
		System.out.println(RPN(arr));
	}

}
