import java.util.Scanner;

public class CreditCardValidator2{

public static void main(String[] args){

	generateCardType();
	generateSecondDigit();
	checkValidity();
	generateCardLength();
	printResult();
 
}


        private static int firstSum = 0;
        private static int secondSum = 0;
       private static String validility = "";
       public static String cardType = "";

	public static void collectInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Kindly enter what you would like to validate: ");
        	String number = scanner.next();
        	int theLength = number.length();
	int[] array = new int[number.length()];
	}
       


	public static int generateCardLength(){
        	if (theLength >= 13 && theLength <= 16) {
            		for (int i = 0; i < number.length(); i++) {
                		String broken = String.valueOf(number.charAt(i));
                		array[i] = Integer.parseInt(broken);
			}
		}

	else{

            validility = "Invalid";
            cardType = "Invalid";
        }
		
	}
            

	public static String generateCardType(){
            if (array[0] == 4) {
                cardType = "Visa Card";
            } else if (array[0] == 5) {
                cardType = "MasterCard";
            } else if (array[0] == 3 && array[1] == 7) {
                cardType = "American Express Card";
            } else if (array[0] == 6) {
                cardType = "Discover card";
            }
		return cardType;
	}

	public static long generateSecondDigit(){

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    int var = array[i] * 2;
                    if (var > 9) {
                        int brokenDown = 0;
                        while (var > 0) {
                            int cals = var % 10;
                            brokenDown += cals;
                            var /= 10;
                        }
                        firstSum += brokenDown;
                    } else {
                        firstSum += var;
                    }
                } else {
                    secondSum += array[i];
                }
	}
		

	}

	public static  int checkValidity(){
		int totalRes = firstSum + secondSum;
            
            if (totalRes % 10 == 0) {
                validility = "Valid";
            } else {
                validility = "Invalid";
            }
		return validity;
        }


	public static void printResult(){

	System.out.printf("""
                *****************************************
                **Credit Card Type: %s
                **Credit Card Number: %s
                **Credit Card Digit Length: %s
                **Credit Card Validity Status: %s
                ******************************************
                """,cardType,number,theLength,validility);
	
	}
	
	



	
    
}