package uebung_2_1;

public class QuadratischeGleichung {

	public static void main(String[] args) {
	
		double p = 8;
		double q = 15;
		
		double vWurzel = -1*(p/2);
		double uWurzel = ((p/2)*(p/2))-q;
		
		double loesung1 = vWurzel + Math.sqrt(uWurzel);
		double loesung2 = vWurzel - Math.sqrt(uWurzel);
		
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2);
	}

}
