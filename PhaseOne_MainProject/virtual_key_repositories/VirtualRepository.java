package virtual_key_repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import fileOperation.FileBasicOperations;

public class VirtualRepository {

	//create file
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
	
	//file info
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
	
	//write file
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
	
	//read file
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
	
	//delete file
	public void fileDelete(String fileName) {
	    File f0 = new File(("D:" + fileName));    
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    } 
	}
	
	public static void main(String[] args) {
		
		//welcome message
		System.out.println("+ -------------------------------------------+");
		System.out.print("|    ");
		System.out.print("Welcome to Virtual Key Repositores App");
		System.out.println("  |");
		System.out.println("+ -------------------------------------------+");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String inputFileName = sc.nextLine();
		FileBasicOperations fileBasicOperations = new FileBasicOperations();
		fileBasicOperations.fileInfo(inputFileName);
		int inputOperation ;
		System.out.println("Enter the option :: \n0.Create file \n1.File Information \n2.Write in file \n3. Read the file \n4.Delete file \n5.Work with another file \n6.Exit");
		inputOperation = sc.nextInt();
		while(inputOperation != 6) {
			if(inputOperation == 0) {
				System.out.println("=========================================================");
				fileBasicOperations.createFile(inputFileName);
				System.out.println("=========================================================");
			}
			else if(inputOperation == 1) {
				System.out.println("=========================================================");
				fileBasicOperations.fileInfo(inputFileName);
				System.out.println("=========================================================");
			}
			else if(inputOperation == 2) {
				System.out.println("=========================================================");
				System.out.println("Enter the text to write in the file : ");
				String inputTextToWrite;
				inputTextToWrite = sc.nextLine();
				fileBasicOperations.fileWrite(inputFileName, inputTextToWrite);
				System.out.println("=========================================================");
			}
			else if(inputOperation == 3) {
				System.out.println("=========================================================");
				fileBasicOperations.fileRead(inputFileName);
				System.out.println("=========================================================");
			}
			else if(inputOperation == 4) {
				System.out.println("=========================================================");
				fileBasicOperations.fileDelete(inputFileName);
				System.out.println("=========================================================");
			}
			else if(inputOperation == 5) {
				System.out.println("=========================================================");
				System.out.println("Enter the file name : ");
				inputFileName = sc.next();
				System.out.println("=========================================================");
			}
			else {
				System.out.println("Enter the Correct option..");
			}
			
			System.out.println("Enter the option :: \n0.Create file \n1.File Information \n2.Write in file \n3. Read the file \n4.Delete file \n5.Work with another file \n6.Exit");
			inputOperation = sc.nextInt();	
		}
		
		//exit message
		System.out.println("+ --------------------------------------------------+");
		System.out.print("|    ");
		System.out.print("Visist Again to Virtual Key Repositores App");
		System.out.println("    |");
		System.out.println("+ --------------------------------------------------+");
	}

}
