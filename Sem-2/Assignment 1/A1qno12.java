class Flower{
	String name;
	int petal;
	double price;
	void setvalue(String n,int p,double pri) {
		name=n;
		petal=p;
		price=pri;
	}
	void getvalue() {
	System.out.println(name+petal+price);
}}
public class A1qno12 {

	public static void main(String[] args) {
		Flower f1=new Flower();
		f1.setvalue("Sunflower", 10, 100);
		f1.getvalue();
	}

}
