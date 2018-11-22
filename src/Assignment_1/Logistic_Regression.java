package Assignment_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Logistic_Regression {
	
	
	public static class Main {
		
		public static void main(String[] args) {

	        String csvFile = "C:\\\\Users\\\\PKEAV\\\\eclipse-workspace\\\\MLDM_Assignment\\\\Doc\\\\owls.csv";
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] owlInfo = line.split(cvsSplitBy);

	                System.out.println("body-length = " + owlInfo[0] + ", \t wing-length=" + owlInfo[1]  + ", \t body-width =" + owlInfo[2] + 
	                					", \t wing-width = " + owlInfo[3] + ", \t type = " + owlInfo[4]);
	              
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
		}
		/*public static void main(String[] args) {
			 String fileName = "C:\\Users\\PKEAV\\eclipse-workspace\\MLDM_Assignment\\Doc\\owls.csv";
			 File file = new File(fileName);
			 
			 try {
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext()) {
					String data = inputStream.next();
					System.out.println(data + "***" );
				}
				inputStream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
