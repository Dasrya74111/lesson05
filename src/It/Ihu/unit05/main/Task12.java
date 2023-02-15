package It.Ihu.unit05.main;
import static java.lang.Math.pow;

public class Task12 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		
		a = 7;
        b = 11;
        c = -9;

        
        if (a >= 0) {
        	a = Math.pow(a, 2);
            System.out.println("a в квадрате = " + a);
        } else if (a < 0){
        	a = Math.pow(a, 4);
        	System.out.println("a в четвертой степени = " + a);
        }
        if (b >= 0) {
        	b = Math.pow(b, 2);
            System.out.println("b в квадрате = " + b);
        } else if (b < 0){
        	b = Math.pow(b, 4);
        	System.out.println("b в четвертой степени = " + b);
        }
        if (c >= 0) {
        	c = Math.pow(c, 2);
            System.out.println("c в квадрате = " + a);
        } else if (c < 0){
        	a = Math.pow(c, 4);
        	System.out.println("c в четвертой степени = " + a);
        }


	}

}
