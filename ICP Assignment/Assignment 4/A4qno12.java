public class A4qno12{
public static void main(String args[]){
System.out.println("log N, N, NlogN, N2, N3, 2N ");
for(int N=16;N<=2048;N=N*2)
System.out.println(Math.log(N)+"\t"+N+"\t"+N*Math.log(N)+"\t"+Math.pow(N,2)+"\t"+Math.pow(N, 3)+"\t"+Math.pow(2, N));
}}