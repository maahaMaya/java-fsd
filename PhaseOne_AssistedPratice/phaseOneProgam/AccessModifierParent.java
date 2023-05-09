package phaseOneProgam;

public class AccessModifierParent {
	
	//declare varibles 
	public static int a = 10;
	private static int b = 20;
	protected static  int c = 30;
	static int d = 40;
	
	public static void main(String[] args) {
		System.out.println("public aceess modifers  (a) is : " + a);
		System.out.println("private aceess modifers  (b) is : " + b);
		System.out.println("protected aceess modifers  (c) is : " + c);
		System.out.println("default aceess modifers  (d) is : " + d);
	}
}


//Output
//public aceess modifers  (a) is : 10
//private aceess modifers  (b) is : 20
//protected aceess modifers  (c) is : 30
//default aceess modifers  (d) is : 40