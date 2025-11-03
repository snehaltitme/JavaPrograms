package methodsandvariables;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MADAM";
		String original = str;
		String revString="";
		
		System.out.println("String is "+original);
		
		for(int i=str.length()-1; i>=0; i--) {
			
			char temp=str.charAt(i);
			revString=revString+temp;
			
		}
		
		System.out.println("reverse string is:" +revString);
		
		System.out.println("string is Pallindrome: ");
		if (original.equals(revString)) {
			
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
