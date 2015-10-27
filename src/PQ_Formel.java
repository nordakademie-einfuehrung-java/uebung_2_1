
public class PQ_Formel {

	public static void main(String[] args) {
	double p = 8;
	double q = 20;
	
	double unterDerWurzel = ((p/2)*(p/2))-q;
	double vorDerWurzel = -1 * (p/2);
			
	if (unterDerWurzel > 0) {
	
	double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
	double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
	
	
	
	
	System.out.println("X1= " + loesung1);
	System.out.println("X2= " + loesung2);
	}
	
	else  { if (unterDerWurzel < 0)
	{ System.out.println("Keine Loesung");
	}
	else { 
		System.out.println("X1=X2= " + vorDerWurzel);
	}
	}
	
	}

}
