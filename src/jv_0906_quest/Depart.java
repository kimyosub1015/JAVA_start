package jv_0906_quest;

public class Depart extends Employee {
	String department;
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	public void getInformation() {
		System.out.println("�̸� : "+getName()+"\t���� : "+getSalary()+"\t�μ�:"+this.department);
	}

}
/*
package jv_0906_quest;

public class Depart extends Employee {
	private String department;
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	public void getInformation() {
		System.out.printf("�̸�: %s\t����: %d\t�μ�:%s\n", getName(), getSalary(),department);
	}

}
*/