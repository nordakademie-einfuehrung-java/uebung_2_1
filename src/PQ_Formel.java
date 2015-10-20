
public class PQ_Formel {

	public static void main(String[] args) {
	double p = 8;
	double q =15;
	
	double unterDerWurzel = ((p/2)*(p/2))-q;
	double vorDerWurzel = -1 * (p/2);
			
			double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
	double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
	
	System.out.println("X1= " + loesung1);
	System.out.println("X2= " + loesung2);
	}

}
