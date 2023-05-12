package phaseOneSecondProgram;

import java.io.File;  
import java.io.IOException; 
import java.io.FileWriter;
import java.io.FileNotFoundException;     
import java.util.Scanner;   

public class FilesCurdOperation {

	public void createFile(String fileName) {
        try {  
            // Creating an object of a file  
            File f0 = new File("D:" + fileName);   
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");  
            } else {  
                       System.out.println("File is already exist in the directory.");  
            }
          } catch (IOException exception) {  
                   System.out.println("An unexpected error is occurred.");  
                   exception.printStackTrace();  
       } 
	}
	
	public void fileInfo(String fileName) {
        // Creating file object  
        File f0 = new File("D:" + fileName);  
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
	}
	
	public void fileWrite(String fileName, String inputTextToWrite) {
	    try {  
	        FileWriter fwrite = new FileWriter("D:" + fileName);  
	        // writing the content into the  file  
	        fwrite.write("Content is written in thr file");   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        } 
	}
	
	public void fileRead(String fileName) {
        try {  
            // Create f1 object of the file to read data  
            File f1 = new File("D:" + fileName);    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        } 
	}
	
	public void fileDelete(String fileName) {
	    File f0 = new File(("D:" + fileName));    
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    } 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String inputFileName = sc.nextLine();
		FilesCurdOperation fileBasicOperations = new FilesCurdOperation();
		fileBasicOperations.fileInfo(inputFileName);
		int inputOperation ;
		System.out.println("Enter \n 1.Create file\n 2.Write in file\n 3. Read the file \n 4.Delete file \n 5.Exit");
		inputOperation = sc.nextInt();
		while(inputOperation != 5) {
			if(inputOperation == 1) {
				fileBasicOperations.createFile(inputFileName);
			}
			else if(inputOperation == 2) {
				System.out.println("Enter the text to write in the file : ");
				String inputTextToWrite;
				inputTextToWrite = sc.nextLine();
				fileBasicOperations.fileWrite(inputFileName, inputTextToWrite);
			}
			else if(inputOperation == 3) {
				fileBasicOperations.fileRead(inputFileName);
			}
			else if(inputOperation == 4) {
				fileBasicOperations.fileDelete(inputFileName);
			}
			
			System.out.println("Enter \n 1.Create file\n 2.Write in file\n 3. Read the file \n 4.Delete file \n 5.Exit");
			inputOperation = sc.nextInt();	
		}
	}
	
}
