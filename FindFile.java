import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindFile {

	public static void main(String[] args) {
		  
       

		  Scanner scan = new Scanner(System.in);
	        System.out.print("Enter number of Frame: ");

	        // This method reads the number provided using keyboard
	        int num = scan.nextInt();

	        // Closing Scanner after the use
	        scan.close();
	        
	        // Displaying the number 
	        System.out.println("The number entered by user: "+num);
	        String fileName = "DiffFrame"+num+""+".txt";
//            StringBuilder sb = new StringBuilder();

	        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

	            // read line by line
	            String line;
	            int i = 1;
	            while ((line = br.readLine()) != null) {
	            		i++;
	            }
	        
	            
	            	System.out.print(fileName);
	            

	        } catch (IOException e) {
	        	System.err.format("Your input not correct");
//	            System.err.format("IOException: %s%n", e);
	        }


        
        
    
}
}
