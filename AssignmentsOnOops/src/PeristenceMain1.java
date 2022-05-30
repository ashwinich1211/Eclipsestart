
public class PeristenceMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peristence Fp=new FilePersistence();
		Fp.peristence("Am from fileperistence");
		Peristence Dp=new DatabasePeristence();
			Dp.peristence("am from Database peristence");	
		
		}

}
