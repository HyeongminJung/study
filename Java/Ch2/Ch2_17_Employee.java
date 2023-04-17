package Ch2;

class Employee{
	private static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String departmentString;
	
	public Employee()
	{
		serialNum++;
		this.employeeId = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		//this.employeeName = "Lee";  //오류발생
		Employee.serialNum = serialNum;
	}

	public int getEmployeeId() {
		serialNum = 1000;
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartmentString() {
		return departmentString;
	}

	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}
}


public class Ch2_17_Employee {
	public static void main(String[] args) {

		System.out.println(Employee.getSerialNum());
		Employee.setSerialNum(1003);
		System.out.println(Employee.getSerialNum());
	}

}
