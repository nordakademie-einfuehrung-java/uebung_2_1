
public class PQFormel {

	public static void main(String[] args) {
		double p = 8;
		double q = 4;
		
		double udw = ((p*p/4)-q);
		double vdw = -1*p/2;
		double loesung1 = vdw+Math.sqrt(udw);
		double loesung2 = vdw-Math.sqrt(udw);
	    System.out.println("x1= "+loesung1);
	    System.out.println("x2= "+loesung2);

	}

}
