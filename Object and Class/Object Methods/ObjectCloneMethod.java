
class Student implements Cloneable{
	
	int rollNo;
	String name;
	public Student1(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	
}
public class ObjectCloneMethod {

	public static void main(String[] args) {
		
		Student s1=new Student(502, "venkatesh");
		System.out.println("Student RollNO:"+s1.rollNo+"\tStudent Name:"+s1.name);
		System.out.println("====================Clone()===============");
		try {
			Student s2=(Student) s1.clone();
			System.out.println("Student RollNO:"+s2.rollNo+"\tStudent Name:"+s2.name);
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Not Supported");
			e.printStackTrace();
		}

	}

}
/*The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.*/
/*Why use clone() method ?
The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.*/