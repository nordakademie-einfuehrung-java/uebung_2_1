package uebung_2_1;

public class QuadratischeGleichung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 8;
		double q = 15;
		
		double unterDerWurzel = ((p/2)*(p/2))-q;
		double vorDerWurzel = -1 * p / 2;
		
		double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
		double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
		
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2);

	}

}
