
public class Conditions {

	public static void main(String[] args) {
		
		//in the first part if a is 3 the condition will be true and also if a is another number but b is higher than 5
		int a= 7;
		
		int b= 5;
		
		//in the second part a must be 7 and b higher than 4

		if ( ((a == 3) || ( b > 5))
	            || ((a == 7)  && ! (b < 4)) )  {
	            System.out.println( "Se cumple la condición" );
	        }
	        else {
	            System.out.println( "No se cumple la condición" );
	        }
	}

}
