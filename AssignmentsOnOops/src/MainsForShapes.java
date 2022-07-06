import java.util.Scanner;

public class MainsForShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape yy = new Line();
		yy.draw(sc.nextInt());
		Shape zz = new Rectangle();
		zz.draw(sc.nextInt());
		Shape kk = new Cube();
		kk.draw(sc.nextInt());

	}

}
