//------------------------------------------------------------
// Assignment 3 
// Written by: Vraj Patel (40155059)
//For COMP 248 Section AI(lab) AAAE(Tutorial)
//-------------------------------------------------------------

// import Scanner from the library
import java.util.Scanner;
public class Vaccinedriver {

	public static void main(String[] args) {
// Display the opening statement to user
		System.out.println("--------------------------------------------");
		System.out.println("        Vaccine Class Driver Program        ");
		System.out.println("--------------------------------------------");
// Declare any variable to Scanner
		Scanner keyIn= new Scanner(System.in);
		Vaccine vaccine1 = new Vaccine();
// Prompt the user for name,type,dose and company of vaccine2
		System.out.println("Enter the name, type, dose and company of vaccine2 please: ");
		String vaccine_name = keyIn.next();
		String vaccine_type = keyIn.next();
		int vaccine_dose =keyIn.nextInt();
		String vaccine_company = keyIn.next();
		Vaccine vaccine2 = new Vaccine(vaccine_name,vaccine_type,vaccine_dose,vaccine_company);
// Create vaccine3 using the copy constructor method
		Vaccine vaccine3 = new Vaccine(vaccine2);

// Display the vaccine info of three objects
// vaccine1
		System.out.println("\nvaccine 1 is The vaccine info\n " + vaccine1 + "\n");
// vaccine 2
		System.out.println("vaccine 2 is The vaccine info\n " + vaccine2 + "\n");
// vaccine 3
		System.out.println("vaccine 3 is The vaccine info\n " + vaccine3 + "\n");
// compare vaccine2 and vaccine 3 and display it to use
		System.out.println("Compare the two vaccine objects (vaccine2&3):\nThe vaccine info\n " + vaccine2);
		if (vaccine2.equals(vaccine3))
			System.out.println(" is equal to The vaccine info");
		else 
			System.out.println("is not equal to The vaccine info");
		System.out.println(" " + vaccine3 +"\n");
// Prompt the user for name,type,dose and company of vaccine2
		System.out.println("Enter the name, type, dose and company of vaccine1 please: ");
		vaccine1.setName(keyIn.next());
		vaccine1.setType(keyIn.next()); 
		vaccine1.setDose(keyIn.nextInt());
		vaccine1.setCompany(keyIn.next());
		
// Display vaccine 1 after the change 
		System.out.println("\nVaccine 1 is now: The vaccine info\n " + vaccine1 + "\n");
// Display the closing statement to user
		System.out.println("Thank you for using this program!");	
// close key
		keyIn.close();
	}

}
