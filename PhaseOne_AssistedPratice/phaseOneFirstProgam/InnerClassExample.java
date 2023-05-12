package phaseOneFirstProgam;

// outer class and inner class
class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
}
public class InnerClassExample {

	public static void main(String[] args) {
		
		//access inner class
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);

	}

}
