package has_a;

public class Person {
	String name ;

	String gender;
	
	Address ad;
}

//Address class=====================================

class Address{
	String city  ; 

	String state ;
	String pinCode ;
}

//Instructor class=====================================

class Instructor extends Person{
	int instructorId ; 

	int salary ; 
}

//Student class=====================================

class Student extends Person{
	int studentId ; 
	String courseEnrolled ; 
	int courseFee ; 	
}