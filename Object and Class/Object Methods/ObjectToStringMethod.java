

class Student{
	
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	//toString() method
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

public class ObjectToStringMethod {

	public static void main(String[] args) {
		
		Student s1=new Student(121, "Raju");
		Student s2=new Student(122, "Abhi");
		System.out.println(s1);
		System.out.println(s2);

	}

}
/*By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.*/