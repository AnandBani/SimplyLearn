import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		//Employee Details
		System.out.print("Employee ID: ");
//for Id
		Scanner sc = new Scanner(System.in);
		int Id = sc.nextInt();
		
		//for Name
		System.out.print("Employee Name: ");
		String name =sc.next();
		
		//for Salary 
		System.out.print("Employee salary : ");
		int Salary = sc.nextInt();
		
		//for Designation
		System.out.print("Employee Designation: ");
		String Designation =sc.next();
		
		//output after all data entry
		System.out.println("Emplyee ID : "+Id);
		System.out.println("Employee Name : " +name);
		System.out.println("Emplyee Salary : " +Salary);
		System.out.println("Emplyee Designation : " +Designation);
	}		
}

