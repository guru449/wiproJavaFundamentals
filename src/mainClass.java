
public class mainClass {
	public static void main(String[] args)
	{
		Employee employees[] = new Employee[7];
		employees[0]= new Employee("1001", "Ashish", "01/04/2019",
				'e', "R&D", 20000, 8000, 3000);
		employees[1]= new Employee("1002", "Sushma", "23/08/2012",
				'c', "PM", 30000, 12000, 9000);
		employees[2]= new Employee("1003", "Rahul", "12/11/2008",
				'k', "Acc", 10000, 8000, 1000);
		employees[3]= new Employee("1004", "Chahat", "29/01/2013",
				'r', "FrontDesk", 6000, 8000, 2000);
		employees[4]= new Employee("1005", "Ranjan", "16/07/2005",
				'm', "Engg", 50000, 20000, 20000);
		employees[5]= new Employee("1006", "Suman", "01/01/2000",
				'e', "Manufacturing", 23000, 9000, 4400);
		employees[6]= new Employee("1007", "Tanmay", "12/06/2006",
				'c', "PM", 29000, 12000, 10000);
		String designation = "";	
		for(int i=0;i<employees.length;i++) {
			if(employees[i].employeeNo.equalsIgnoreCase(args[0])) {
				System.out.println(" EmpNo "+ " EmpName " + " Department "
			    + " Designation " + " Salary ");
				int da = 0;
				char code = employees[i].designationCode;
				switch(code) {
				case 'e':	designation = "Engineer";
							da = 20000;
							break;
				case 'c' :	designation = "Consultant";
							da = 32000;
							break;
				case 'k' :	designation = "Clerk";
							da = 12000;
							break;
				case 'r' : 	designation = "Receptionist";
							da = 15000;
							break;
				case 'm' :	designation = "Manager";
							da = 40000;
							break;
				}
				int salary = employees[i].basics + employees[i].hra
						+ da - employees[i].it;
				System.out.println(employees[i].employeeNo + 
						employees[i].employeeName + 
						employees[i].department +
						designation + 
					    salary);
			}
			else {
				System.out.println("There is no employee with id" + args[0]);
			}
			
		}
		
		
	}

}
