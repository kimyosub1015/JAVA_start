package jv_0906_quest;

public class Employee {
	private String name;
	private int salary;

	public Employee() {

	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void getInformation() {
		System.out.printf("�̸�: %s   ����: %d\n", name, salary);
	}

}
