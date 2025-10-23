package loopingprograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=74367;
	int count=0;
	int originalnum=num;
	
	
	while(num != 0) {
		
		num=num/10;   // remove last digit
		count++;     // increase count to calculate how many times it will execute
		
	}
	
	System.out.println("No =" + originalnum);
	System.out.println("Total digits in no are =" + count);
			
	}

}
