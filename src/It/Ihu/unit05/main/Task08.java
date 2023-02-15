package It.Ihu.unit05.main;

public class Task08 {

	public static void main(String[] args) {
		
		double a;
		int b;
		
		a = 1.3;
		b = 6;

        double a2;
        a2 = a * a;
        
        int b2;
        b2 = b * b;
        
        if (a2 < b2) {
            System.out.println("Наименьший из квадратов а и b - a =  " + a2);
        } else {
        	System.out.println("Наименьший из квадратов a и b - b = " + b2);
        }
        
	}

}
