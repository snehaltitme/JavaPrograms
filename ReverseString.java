package methodsandvariables;


public class ReverseString {

	public static void main(String[] args) {


		String str= "Hello my self Snehal Titme";
		String originalString=str;
		
		String revString="";
		
		for(int i=str.length()-1 ; i>=0; i--)
		{
			char temp=str.charAt(i);
			revString= revString+temp;
		}
			
		System.out.println("Reverse of string is: " +revString);
		
		
	}

}
