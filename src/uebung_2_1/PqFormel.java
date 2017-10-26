package uebung_2_1;

public class PqFormel {

	public static void main(String[] args) {
		double p = 8;
		double q = 15;
		
		double unterWurzel= ((p/2)*(p/2))-q;
		double vorderWurzel= -1*p/2;
		
		double loesung1 = vorderWurzel + Math.sqrt(unterWurzel);
		double loesung2 = vorderWurzel - Math.sqrt(unterWurzel);
		System.out.println("x1 = " + loesung1); 
		System.out.println("X2 = " + loesung2);
	}

}
