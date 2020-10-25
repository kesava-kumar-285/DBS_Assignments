public class Employee {
  public int empId;
  public String name;
  public String designation;
  public String dept;
  public int salary;
public Employee(int empId, String name, String designation, String dept, int salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.designation = designation;
	this.dept = dept;
	this.salary = salary;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
}