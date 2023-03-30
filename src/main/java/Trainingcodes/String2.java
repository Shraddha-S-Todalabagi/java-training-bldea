package Trainingcodes;

public class String2 {
	 
		   public static void main(String[] args) {	   
			    String text = "LOWERED";
			
				System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '@'));
		        }

		   public static String validate(String text, char chr) {
			   return text.replaceAll("[aeiouAEIOU]", "" + chr);
		  }
}
