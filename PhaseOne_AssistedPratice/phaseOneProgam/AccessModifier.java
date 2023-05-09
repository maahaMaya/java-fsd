package phaseOneProgam;

public class AccessModifier {
	public static void main(String[] args) {
		//calling parent class and print varibles
		AccessModifierParent accessModifierParent = new AccessModifierParent();
		System.out.println("public aceess modifers  (a) is : " + accessModifierParent.a);
		//System.out.println("private aceess modifers  (b) is : " + accessModifierParent.b);
		System.out.println("protected aceess modifers  (c) is : " + accessModifierParent.c);
		System.out.println("default aceess modifers  (d) is : " + accessModifierParent.d);
	}
}
