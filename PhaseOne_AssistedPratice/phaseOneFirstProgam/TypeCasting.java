package phaseOneFirstProgam;

public class TypeCasting {

	public static void main(String[] args) {
		// Implict Type Casting Example
		int a = 12;
		float b = a;
		System.out.println("Int to Float (Implict Type Casting) : " + b);
		
		short c = 12;
		int d = c;
		System.out.println("short to int (Implict Type Casting) : " + d);
		
		// Explict Type Casting Example
		
		float f = 12.92f;
		int g = (int) f;
		System.out.println("float to int (Explict Type Casting) : " + g);
		
		char h = 'A';
		int i = (int) h;
		System.out.println("float to int (Explict Type Casting) : " + i);
	}
}


/*
 * //Output 
 * Int to Float (Implict Type Casting) : 12.0 short to int (Implict
 * Type Casting) : 12 float to int (Explict Type Casting) : 12 float to int
 * (Explict Type Casting) : 65
 */
