
public class Test {
	public static void main(String[]args) {
		//Encapsulation
		EmployeeInfo studentID=new EmployeeInfo();
		studentID.setStudentID(102102);
		EmployeeInfo name=new EmployeeInfo();
		name.setName("Adam");
		System.out.println("Student info: ");
		System.out.println("name="+name.getName() +"\n"+"ID=" +studentID.getStudentID() +"\n");
		//Inheritance
		Student StudentWork = new Student();
		System.out.println("Most common quotes by students and teachers:");
		StudentWork.konwledge();
		StudentWork.teach();
		//Polymorphism
		Student subjects = new Student();
		System.out.println("Subjects:");
		System.out.println("Total Subjects taught by teacher="+subjects.subjectsPerClass(5,4));
		Teacher subjects1=new Teacher();
		System.out.println("Total Subjects taken by students="+subjects1.subjectsPerClass(5,4)+"\n");
		//Interface
		PNTschool policy = new PNTschool();
		System.out.println("School policy:");
		policy.attendance();	//From OurSchool class
		policy.courseWork();	//From PNTschool class
		policy.homework();      //From OurSchool class
		
	}
}
	
