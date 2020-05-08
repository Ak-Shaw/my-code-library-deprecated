import java.util.*;
import java.util.regex.*;

public class Plate {

	String plate;	
	String firstPart;
	String secondPart;
	String thirdPart;
	String fourthPart;

	Plate(String plate) {

		this.plate = plate;

		ArrayList<String> splitParts = splitStringIndexOf(plate, '-');

		this.firstPart = splitParts.get(0);

		int parts = splitParts.size();

		if (parts > 3) {

			this.secondPart = splitParts.get(1);
			this.thirdPart = splitParts.get(2);
			this.fourthPart = splitParts.get(3);
		} 

		if (parts == 3) {

			this.secondPart = splitParts.get(1);
			this.thirdPart = "";
			this.fourthPart = splitParts.get(2);
		}

		if (parts < 3) {

			this.firstPart = "";
			this.secondPart = "";
			this.thirdPart = "";
			this.fourthPart = "";
		}

	}

	public String getFourthPart() {
		return this.fourthPart;
	}

	// Splits the given String w.r.t. the Character as 
	// delimeter and returns result as ArrayList<String>.
	public static ArrayList<String> splitStringIndexOf(String longString, char delimeter) {
    	
    	longString = longString + Character.toString(delimeter);

    	int pos = 0, end;
    	
    	ArrayList<String> stringSplit = new ArrayList<String>();

    	while ((end = longString.indexOf(delimeter, pos)) >= 0) {
        	stringSplit.add(longString.substring(pos, end));
        	pos = end + 1;
    	}
    	
    	return stringSplit;
	}

	// Checks whether the fourthPart is a 
	// palindrome or not.
	public boolean satisfiesSameersWish() {

		String fourthPart = this.getFourthPart();

		int i = 0, j = fourthPart.length() - 1; 

        while (i < j) { 
  
            if (fourthPart.charAt(i) != fourthPart.charAt(j)) 
                return false; 
  
            i++; 
            j--; 
        } 
  
        return true; 
	}

	// Accepts the regPattern in a regArray[] form,
	// i.e., split into different ranges. 
	// Then for each digit, it first creats the Regex 
	// by appending "[" infront and "]" behind the elements 
	// of regArray[]. 
	// If the end result is false, then it also prints the 
	// suggestion.
	public boolean satisfiesPattern(String[] regArray) {

		String dig1 = Character.toString(getFourthPart().charAt(0));
		String dig2 = Character.toString(getFourthPart().charAt(1));
		String dig3 = Character.toString(getFourthPart().charAt(2));
		String dig4 = Character.toString(getFourthPart().charAt(3));

		Pattern pattern = Pattern.compile("[" + regArray[0] + "]");
        Matcher matcher = pattern.matcher(dig1);
        boolean verifyDig1 = matcher.matches();

        if (!verifyDig1) {

        	dig1 = Character.toString(regArray[0].charAt(0));
        }

        pattern = Pattern.compile("[" + regArray[1] + "]");
        matcher = pattern.matcher(dig2);
        boolean verifyDig2 = matcher.matches();

        if (!verifyDig2) {

        	dig2 = Character.toString(regArray[1].charAt(0));
        }

        pattern = Pattern.compile("[" + regArray[2] + "]");
        matcher = pattern.matcher(dig3);
        boolean verifyDig3 = matcher.matches();

        if (!verifyDig3) {

        	dig3 = Character.toString(regArray[2].charAt(0));
        }

        pattern = Pattern.compile("[" + regArray[3] + "]");
        matcher = pattern.matcher(dig4);
        boolean verifyDig4 = matcher.matches();

        if (!verifyDig4) {

        	dig4 = Character.toString(regArray[3].charAt(0));
        }

        if (verifyDig1 && verifyDig2 && verifyDig3 && verifyDig4) {

        	System.out.println("Good");
        	return true;
        }

        System.out.print("Bad ");
        String suggestion = dig1 + dig2 + dig3 + dig4;
        System.out.println(suggestion);

        return false;
	}

	public String toString() {

		if (thirdPart.isEmpty()) {
			return firstPart + "-" + secondPart + "-" + fourthPart;
		}
		return firstPart + "-" + secondPart + "-" + thirdPart + "-" + fourthPart;
	}

	// Checks the validity of Plate object. 
	// It verifies all the four parts individually 
	// and progressively. 
	public boolean isRegisteredVehicle() {

		// e.g., BR-62--6871 is incorrect
		if (this.plate.contains("--")) {
			return false;
		}

		boolean firstPartVerification = this.verifyFirstPart();

		if (firstPartVerification) {

			boolean secondPartVerification = this.verifySecondPart();
		
			if (secondPartVerification) {

				boolean thirdPartVerification = this.verifyThirdPart();

				if (thirdPartVerification) {

					boolean fourthPartVerification = this.verifyFourthPart();
		
					if (fourthPartVerification) {

						return true;
					}
				}
			}
		}

		return false;
		
	}

	// First two letters indicate the 
	// State or Union Territory in which 
	// the vehicle is registered.
	public boolean verifyFirstPart() {

		switch (this.firstPart) {
			
			case "AP":
			case "AR":
			case "AS":
			case "BR":
			case "CG":
			case "GA":
			case "GJ":
			case "HR":
			case "HP":
			case "JH":
			case "KA":
			case "KL":
			case "MP":
			case "MH":
			case "MN":
			case "ML":
			case "MZ":
			case "NL":
			case "OD":
			case "PB":
			case "RJ":
			case "SK":
			case "TN":
			case "TS":
			case "TR":
			case "UP":
			case "UK":
			case "WB":
			case "AN":
			case "CH":
			case "DD":
			case "DL":
			case "JK":
			case "LA":
			case "LD":
			case "PY":

				return true;

			default: 

				return false;
		}

	}

	// Second part has two digits which represents
	// the sequential number of a district; ranges from (00-99).
	public boolean verifySecondPart() {

		Pattern pattern = Pattern.compile("[0-9]{2}");
        Matcher matcher = pattern.matcher(this.secondPart);
        return matcher.matches();
	}

	// Third part consists of zero, one, two or 
	// three letters; all uppercase.
	public boolean verifyThirdPart() {

		Pattern pattern = Pattern.compile("[A-Z]{0,3}");
        Matcher matcher = pattern.matcher(this.thirdPart);
        return matcher.matches();
	}
	
	// Fourth part contains exactly four digits; ranges from (0000-9999).
	public boolean verifyFourthPart() {

		Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher = pattern.matcher(this.fourthPart);
        return matcher.matches();
	}
}