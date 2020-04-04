
public class Employee {
	String employeeNo;
	String employeeName;
	String joinDate;
	char designationCode;
	String department;
	int basics;
	int hra;
	int it;
	public Employee(String employeeNo, String employeeName, String joinDate, char designationCode, String department,
			int basics, int hra, int it) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.joinDate = joinDate;
		this.designationCode = designationCode;
		this.department = department;
		this.basics = basics;
		this.hra = hra;
		this.it = it;
	}
}
