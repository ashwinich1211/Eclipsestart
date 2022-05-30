import java.util.Scanner;

public class AssignmentonEmployeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		e.salCalulation(sc.nextInt(), sc.nextInt());
		
		Employee f=new Manager();
		
		f.salCalulation(sc.nextInt(), sc.nextInt());
		Employee g=new Labour();
		g.salCalulation(sc.nextInt(), sc.nextInt());
		
		

	}

}
