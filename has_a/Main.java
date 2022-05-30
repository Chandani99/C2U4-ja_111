package has_a;

public class Main {
	public static Person generatePerson(Person person) {
		
		
		if(person== new Student()) {
		person.ad.city="Chennai";
		person.ad.state="Tamil Nadu";
		person.ad.pinCode="60001";
		Student st=(Student)person;
		st.courseEnrolled="23";
		st.name="XYZ";
		st.courseFee=2500;
		System.out.println("Student Name:" +st.name);
		System.out.println("Student Enrolled:" +st.courseEnrolled);
		System.out.println("Student courseFee:" +st.courseFee);
		System.out.println("Address:"+"City= "+person.ad.city+"State= "+person.ad.state+"Pin= "+person.ad.pinCode);
		
		
		return st;
		}
		else if(person== new Instructor()) {
			person.ad.city="Chennai";
			person.ad.state="Tamil Nadu";
			person.ad.pinCode="60001";	
			Instructor ins=(Instructor) person;
			ins.instructorId=12312;
			ins.salary=45000;
			
			System.out.println("Instructor Id:" +ins.instructorId);
			System.out.println("Salary:" +ins.salary);
			System.out.println("Address:"+"City= "+person.ad.city+"State= "+person.ad.state+"Pin= "+person.ad.pinCode);
			
			return ins;
		}
		return null;
		
	}
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println( );
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}

}
