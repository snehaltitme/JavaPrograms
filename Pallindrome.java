package loopingprograms;

public class Pallindrome {

	public static void main(String[] args) {
		int num=121;
		int originalnum=121;
		int rev=0;
		
		System.out.println("No =" + num);
		
		while(num!=0) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num= num/10;
					
		}
		
		System.out.println("reverse no =" +rev);
		
		if (originalnum==rev) {
			System.out.println("No is pallindrome");
		
		}
		else {
			System.out.println("Not a pallindrome");
		}
	}

}
