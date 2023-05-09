package emailValidatorFind;
import java.util.regex.*;    
import java.util.*;    

public class EmailValdiaton {
	static String emailRegex = "^(.+)@(.+)$";
	public static void main(String[] args) {
		
		//array of employee email id
		String[] employeeEmailId = {"emp1@xyz.com", "emp2@xyz.com", "emp3@xyz.com", "emp4@xyz.com"};
		
		// class variables
		String inputEmail;
		System.out.println("Enter the email");
		Scanner sc = new Scanner(System.in);
		inputEmail = sc.nextLine();
		
		//Compile regular expression to get the pattern   
		Pattern pattern = Pattern.compile(emailRegex);  
		
		//Create instance of matcher   
        Matcher matcher = pattern.matcher(inputEmail); 
        
        //Logic for Matching and find email
        if( matcher.matches()) {
        	for(String email : employeeEmailId) {
        		if(email.equals(inputEmail)) {
        			System.out.println("Email found");
        			return;
        		}
        	}
        }
        else {
        	System.out.println("Email pattern is wrong");
        	return;
        }
        System.out.println("Email not found");
	}
}
