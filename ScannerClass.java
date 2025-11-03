package methodsandvariables;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		int a ;
		float b;
		double c;
		String string;
		
			
		Scanner sc = new Scanner(System.in);
		
		//integer
		System.out.println("enter value: ");
		int A = sc.nextInt();
		sc.nextLine();  // consider as new line alwasy mobing from numeric to string value nee to mention nexltline
		
		//float
		System.out.println("enter value: ");
		float B = sc.nextFloat();
		sc.nextLine();  
		
	    //Double
		System.out.println("enter value: ");
		double C = sc.nextDouble();
		sc.nextLine(); 
		
		System.out.println("Enter name");
		String st=sc.nextLine();
		
		System.out.println("Addition is: "+ (A+B+C));
		System.out.println("Subtraction is: "+ (A-B-C));
		System.out.println("Multiplication is: "+(A*B*C));
		System.out.println("length of string is: " +st.length());
				
		sc.close();
		
	}

}
