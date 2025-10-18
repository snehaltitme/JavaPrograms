package conditionalstatement;

public class ConditionalStatements {

	public static void main(String[] args) 
	
	{
		int Maths=35, science=29, English=40;
		int average=((Maths+science+English)/3);
		
		System.out.println("Maths= "+ Maths);
		System.out.println("science= "+ science);
		System.out.println("English= "+ English);
		System.out.println("Average= "+ average);
		
		if(Maths<35 || science<35 || English<35) 
		{
			System.out.println("Failed due to low score in at least one subject.");
			
		}
		
		if(average >= 90 && average <= 100) {
			
			System.out.println("Grade: A+ \nExcellent performance!");
		}
		else if(average >= 75 && average <= 89) {
			
			System.out.println("Grade: A \nExcellent performance!");
			
		}
		else if (average >= 60 && average <= 74) {
			
			System.out.println("Grade: b \nKeep improving.");

			}
		else if (average >= 40 && average <= 59) {
			
			System.out.println("Grade: c \nKeep improving.");

		}
		else {
			System.out.println("Please work harder next time.");
		}
	}
	
}

		