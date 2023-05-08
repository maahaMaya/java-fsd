package calculator;
import java.util.*;

enum CalculatorFunction {
    Add,
    Multiplication,
    Divison,
    Subtraction,
    Exit;
}

public class CalculatorLogic {

	public static void main(String[] args) {
		int inputCalculatorFunctionValue;
		float result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 0.Add 1.Multiplication 2.Divison 3.Subtraction 4.Exit");
		inputCalculatorFunctionValue = sc.nextInt();
		
		
		  while(inputCalculatorFunctionValue != CalculatorFunction.valueOf("Exit").ordinal()) {
			  InputDigitValue inputDigitalValue = new InputDigitValue(); 
			  System.out.println("1st");
			  inputDigitalValue.setFirstName(sc.nextFloat());
			  System.out.println("2nd ");
			  inputDigitalValue.setSecondName(sc.nextFloat());
			  
			  if(inputCalculatorFunctionValue == CalculatorFunction.valueOf("Add").ordinal()) {
				  result = inputDigitalValue.getFirstName() + inputDigitalValue.getSecondName();
				  System.out.print("Result is : " + result);
			  }
			  else if(inputCalculatorFunctionValue == CalculatorFunction.valueOf("Multiplication").ordinal()){
				  result = inputDigitalValue.getFirstName() * inputDigitalValue.getSecondName();
				  System.out.print("Result is : " + result);
			  }
			  else if(inputCalculatorFunctionValue == CalculatorFunction.valueOf("Divison").ordinal()){
				  result = inputDigitalValue.getFirstName() / inputDigitalValue.getSecondName();
				  System.out.print("Result is : " + result);
			  }
			  else if(inputCalculatorFunctionValue == CalculatorFunction.valueOf("Subtraction").ordinal()){
				  result = inputDigitalValue.getFirstName() - inputDigitalValue.getSecondName();
				  System.out.print("Result is : " + result);
			  }
			  
			  System.out.println("\nEnter 0.Add 1.Multiplication 2.Divison 3.Subtraction 4.Exit");
			  inputCalculatorFunctionValue = sc.nextInt();
		  } 
		 
	}

}
