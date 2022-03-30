package com.mphasis.basics;

//POJO or Bean
class Employee{
	
private	int empno;
private	String empname;
//accesablity we use the public methods-setters and getters
//right click -> source -> getters and setters
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
//if you want to print the setter values of the object we use toString method
//right click->source->generate to String
@Override
public String toString() {
	return "Employee [empno=" + empno + ", empname=" + empname + "]";
}

	
}
public class EncapEx {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEmpno(101);
	e.setEmpname("karthik");
	System.out.println(e);
}
}



