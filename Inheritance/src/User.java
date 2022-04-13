
public class User {
	
	String name;
	int age;
	long ph;
	}
	class Employee extends User {
	String specialization;
	}
	class Manager extends User {
	String department;
	}
	class Main {
	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.name = "Candid";
	e1.age = 22;
	e1.ph = 123456789l;
	e1.specialization = "Java";
	Manager m1 = new Manager();
	m1.name = "java";
	m1.age = 25;
	m1.ph = 345789l;
	m1.department = "HR";
	System.out.println(e1.name);
	System.out.println(e1.age);
	System.out.println(e1.ph);
	System.out.println(e1.specialization);
	System.out.println(m1.name);
	System.out.println(m1.age);
	System.out.println(m1.ph);
	System.out.println(m1.department);
	
	}


}
