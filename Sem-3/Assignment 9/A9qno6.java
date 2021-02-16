import java.io.*;
class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int age,roll;
	Student(String name,int age,int roll){
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	public String toString() {
		return name+" "+age+" "+roll;
	}
}
public class A9qno6 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student arr[]=new Student[2];
		arr[0]=new Student("Ishu",19,21);
		arr[1]=new Student("Rituraj",19,14);
		File f=new File("Student.txt");
		FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(arr[0]);
        oos.writeObject(arr[1]);
        oos.close();
        fos.close();
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1=(Student)ois.readObject();
        Student s2=(Student)ois.readObject();
        System.out.println(s1.toString()+"\n"+s2.toString());
	}

}
