package uebung_2_1;

public class QuadratischeGleichung {

	public static void main(String[] args) {
		

		double p = 10;
		double q = 2;
		
		double unterWurzel = ((p/2))*((p/2))-q;
		double vorderWurzel1 = ((-p/2))+Math.sqrt(unterWurzel);
		double vorderWurzel2 = ((-p/2))-Math.sqrt(unterWurzel);
				
		System.out.println("x1= "+ vorderWurzel1);
		System.out.println("x2= "+ vorderWurzel2);
	}

}
