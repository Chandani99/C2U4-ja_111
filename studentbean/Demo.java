package studentbean;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter roll number:");
			int roll=sc.nextInt();
			
			System.out.println("Enter Name:");
			String name=sc.next();
			
			System.out.println("Enter Address:");
			String address=sc.next();
			
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			
			StudentBean sb=new StudentBean();
			sb.setRoll(roll);
			sb.setName(name);
			sb.setAddress(address);
			sb.setMarks(marks);
			
			System.out.println("Roll number: " +sb.getRoll());
			System.out.println("Name: " +sb.getName());
			System.out.println("Address: " +sb.getAddress());
			System.out.println("Marks: " +sb.getMarks());
			System.out.println("***************************************************");
		}

	}

}
