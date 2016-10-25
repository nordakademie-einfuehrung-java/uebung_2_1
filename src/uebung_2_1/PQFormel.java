package uebung_2_1;

public class PQFormel {

	public static void main(String[] args) {
		double p = 2;
		double q = 1;

		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		double vorDerWurzel = -1 * p / 2;

		if (unterDerWurzel == 0) {
			System.out.println("Es gibt nur eine Loesung!" );
			System.out.println("x1 und x2= " + vorDerWurzel);
		} else {
		
		double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
		double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);

		if (unterDerWurzel < 0) {
			System.out.println("keine Lösung");
		} else {
			System.out.println("x1 = " + loesung1);
			System.out.println("x2 = " + loesung2);
		}

	}

}
}