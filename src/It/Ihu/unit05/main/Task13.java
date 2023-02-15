package It.Ihu.unit05.main;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task13 {

	public static void main(String[] args) {

		double x1 = 1.13;
		double y1 = 9;
		double x2 = 7.4;
		double y2 = - 1.5;

		double A = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double B = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (A < B) {
			System.out.println("Точка A ближе к началу координат");
		} else if (A == B){
			System.out.println("Точки A и B на одинаковом расстоянии");
		} else {
			System.out.println("Точка B ближе к началу координат");
		}


	}

}
