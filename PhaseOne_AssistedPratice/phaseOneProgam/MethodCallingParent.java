package phaseOneProgam;

public class MethodCallingParent {
	static void saticMethod() {
		System.out.println("Static method is call");
	}
	
	void nonStaticMethod() {
		System.out.println("Non Static method is call");
	}
	
	public void publicMethod() {
		System.out.println("public method is call");
	}
	
	private void privateMethod() {
		System.out.println("private method is call");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method is call");
	}
	public static void main(String[] args) {

		//static method call
		MethodCallingParent.saticMethod();
		
		//non - static method call
		MethodCallingParent methodCallingParent = new MethodCallingParent();
		methodCallingParent.publicMethod();
		methodCallingParent.protectedMethod();
		methodCallingParent.privateMethod();
		methodCallingParent.nonStaticMethod();
	}
}
