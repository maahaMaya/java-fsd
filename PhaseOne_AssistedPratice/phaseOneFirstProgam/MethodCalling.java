package phaseOneFirstProgam;

public class MethodCalling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method call
		MethodCallingParent.saticMethod();
		
		//non - static method call
		MethodCallingParent methodCallingParent = new MethodCallingParent();
		methodCallingParent.publicMethod();
		methodCallingParent.protectedMethod();
		//methodCallingParent.privateMethod();
		methodCallingParent.nonStaticMethod();
	}
}
