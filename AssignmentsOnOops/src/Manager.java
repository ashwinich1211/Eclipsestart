
public class Manager extends Employee {
	private int basic;
	private int Incentives;

	void salCalulation(int basic, int Extratime) {
		this.basic = basic;
		this.Extratime = Incentives;
		double total = basic * Extratime;
		System.out.println("this is Manager salary" + total);
	}

}
