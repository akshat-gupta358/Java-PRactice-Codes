package ProblemStatements;


abstract class Employee{
	
	protected String email;
	protected long phone;
	protected String fname;
	protected String lname;
	
	public Employee(String mail,long num, String firstname, String lastname) {
		this.email=mail;
		this.phone=num;
		this.fname=firstname;
		this.lname=lastname;
	}
	
	abstract void Payroll();
	
}

class FixedEmployee extends Employee{
	double salaryearned;

	double Salary(int daysWorked) {
		return 5000*daysWorked;
	}
	public FixedEmployee(String mail, long num, String firstname, String lastname, int daysWorked) {
		super(mail, num, firstname, lastname);
		this.salaryearned=Salary(daysWorked);
	}
	
	@Override
	public void Payroll() {
		System.out.println("Name of the Fixed Employee is "+fname+" "+lname);
		System.out.println("Email of the Fixed Employee is "+email);
		System.out.println("Phone number Fixed of the Employee is +91"+phone);
		System.out.println("Payroll the Fixed employee is getting is Rs. "+salaryearned);
	}

	
	
}

class HourlyEmployee extends Employee{
	double salaryearned;

	double Salary(int hours) {
		if(hours<=40) {
			return hours*500;
		}
		
		return (40*500) + ((hours-40)*1.5*500);
	}
	public HourlyEmployee(String mail, long num, String firstname, String lastname, int hours) {
		super(mail, num, firstname, lastname);
		this.salaryearned=Salary(hours);
	}
	
	@Override
	public void Payroll() {
		System.out.println("Name of the Hourly Employee is "+fname+" "+lname);
		System.out.println("Email of the Hourly Employee is "+email);
		System.out.println("Phone number Hourly of the Employee is +91"+phone);
		System.out.println("Payroll the Hourly employee is getting is Rs. "+salaryearned);
	}

	
	
}


class CommissionedEmployee extends Employee{
	double salaryearned;

	double Salary(int sales) {
		int amount=50000;
		return ((double)amount*((float)15/100))*sales;
	}
	public CommissionedEmployee(String mail, long num, String firstname, String lastname, int sales) {
		super(mail, num, firstname, lastname);
		this.salaryearned=Salary(sales);
	}
	
	@Override
	public void Payroll() {
		System.out.println("Name of the Commissioned Employee is "+fname+" "+lname);
		System.out.println("Email of the Commissioned Employee is "+email);
		System.out.println("Phone number of the Commissioned Employee is +91"+phone);
		System.out.println("Payroll the Commissioned employee is getting is Rs. "+salaryearned);
	}

	
	
}

class BaseSalaryEmployee extends Employee{
	double salaryearned;

	double Salary(int sales, long baseSalary) {
		double totalbaseSalary= (double)(baseSalary+((double)baseSalary*((float)10/100)));
		return totalbaseSalary+(5000*((float)12/100))*sales;
	}
	public BaseSalaryEmployee(String mail, long num, String firstname, String lastname, int sales, int baseSalary) {
		super(mail, num, firstname, lastname);
		this.salaryearned=Salary(sales,baseSalary);
	}
	
	@Override
	public void Payroll() {
		System.out.println("Name of the Base Salaried Employee is "+fname+" "+lname);
		System.out.println("Email of the Base Salaried Employee is "+email);
		System.out.println("Phone number Base Salaried of the Employee is +91"+phone);
		System.out.println("Payroll the Base Salaried employee is getting is Rs. "+salaryearned);
	}

	
	
}


public class CompanyEmployee {

	public static void main(String[] args) {
		FixedEmployee a=new FixedEmployee("abc@gmail.com",9855449909L,"Akshat","Gupta",7);
		a.Payroll();
		
		System.out.println();
		
		HourlyEmployee b=new HourlyEmployee("xyz@gmail.com",4534534521L,"Rohan","Sharma",45);
		b.Payroll();
		
		System.out.println();
		
		
		CommissionedEmployee c=new CommissionedEmployee("dgd@yahoo.com",5673456734L,"Vishesh","Yadav",5);
		c.Payroll();
		
		System.out.println();
		
		BaseSalaryEmployee d= new BaseSalaryEmployee("rahul@gmail.com",2456753234L,"Rahul","Verma",12,200000);
		d.Payroll();
	}

}
