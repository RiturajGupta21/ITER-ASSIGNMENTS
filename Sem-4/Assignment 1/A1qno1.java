public class A1qno1{
    public static void main(String[] args) {
        int n=10;
		int c=0;
        while(n>0){
        	c+=n&1;
            n>>=1;
        }
        System.out.println(c);
    }
}