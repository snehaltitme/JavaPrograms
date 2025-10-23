package loopingprograms;

public class SumOfDigits {

	public static void main(String[] args) {

			int num = 345;
			int sum=0;
			int originalnum = num;
			
			while(num != 0){
				
				int digit = num % 10;  // get last no 
				sum = sum + digit;    //store last no and then plus 
				num=  num/10;
				
			}
			
			System.out.println("No =" + originalnum);
			System.out.println("Sum =" + sum);
	}

}
