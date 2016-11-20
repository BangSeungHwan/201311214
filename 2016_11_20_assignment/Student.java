import java.util.ArrayList;
import java.util.Collections;

class Student {

	private String name;
	private int num;

	Student(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	public String getName(){
		return name;
	}

	public static void arrayStudent() {

		ArrayList<String> studentNameList = new ArrayList<String>();
		
		Student s1 = new Student("bsh 1", 1);
		Student s2 = new Student("bsh 2", 2);
		Student s3 = new Student("bsh 3", 3);
		Student s4 = new Student("bsh 4", 4);

		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());

		Collections.sort(studentNameList);

		System.out.println(studentNameList);
	}

	public static void main(String[] args){
		arrayStudent();
	}
}