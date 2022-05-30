
public class Labour extends Employee {
	private int basic;
	private int OverTime;
	
	void salCalulation(int basic,int Extratime )
	{
		this.basic=basic;
		this.OverTime=Extratime;
		
		double total=basic*Extratime;
		System.out.println("this is Labour salary"+total);
		}
	
}
