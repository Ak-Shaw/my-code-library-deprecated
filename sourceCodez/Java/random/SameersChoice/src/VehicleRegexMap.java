import java.util.*;

public class VehicleRegexMap {

	HashMap<String, String[]> map;

	VehicleRegexMap(int numberOfPatterns, String[] vehicleType, String[] regPattern) {

		this.map = new HashMap<String, String[]>(numberOfPatterns);

		for (int i = 0; i < numberOfPatterns; i++) {

			this.map.put(vehicleType[i], generateRegArray(regPattern[i]));
		}
	}

	public String[] getRegArray(String vehicleType) {

		if (this.map.containsKey(vehicleType)) {
			return this.map.get(vehicleType);
		}
		
		String[] defaultRegArray = {"0-9", "0-9", "0-9", "0-9"};

		return defaultRegArray;
		
	}

	// Splits the individual parts of the regPattern into 
	// a String[] array.
	public String[] generateRegArray(String regPattern) {

		String[] regArray = new String[4];

		int regPatternLength = regPattern.length();

		int j = 0;

		for (int i = 0; i < regPatternLength; i++) {

			if (i == regPatternLength - 1) {
				regArray[j] = Character.toString(regPattern.charAt(i));
				break;
			}

			if (regPattern.charAt(i + 1) == '-') {

				regArray[j++] = regPattern.substring(i, i + 3);
				i+=2;
				continue;
			}

			regArray[j++] = Character.toString(regPattern.charAt(i));
		}

		return regArray;
	}
}