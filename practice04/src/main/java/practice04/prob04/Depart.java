package practice04.prob04;

public class Depart extends Employee {
	private String department;
	public Depart(String string, int salary, String department) { //"부모메소드무시하기" 이키워드 자식키워드가 depart
		super(string, salary);
		this.department = department;
		
	}
	public String getDepartment() {
		return department;
	}
	public void getInformation() {
		System.out.println("이름: " + getName() + "\t연봉: " + getSalary() + "\t부서: " + getDepartment());
	}
	
}
