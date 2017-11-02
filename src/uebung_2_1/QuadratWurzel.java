package uebung_2_1;

public class QuadratWurzel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p = 5;
		double q = 100;
		
		double unterderwurzel = (((p/2)*(p/2))-q);
		if (unterderwurzel < 0 ) {
			System.out.println("Es ist keine Lösung möglich.");}
			else {
				double vorderwurzel = (-p/2);
				double x1 = (vorderwurzel - Math.sqrt(unterderwurzel));
				double x2 = (vorderwurzel + Math.sqrt(unterderwurzel));
				System.out.println("Die Ergebnisse:");
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2);
			};
		
		
		
		
	}

}
