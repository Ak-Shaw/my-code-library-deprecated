import java.io.*;
import java.util.*;

class solution {

	// 	1. 	Create vehicleRegexMap object, which basically 
	//		works with a HashMap.
	//	2.	ArrayList<Integer> passedIndices will store 
	//		the indices of the plate[] array, which is 
	//		also the same for their respective vehicle[] 
	//		array.
	//	3.	For each Plate:
	//		
	//		a. Check for Plate validiy.
	//		b. Check whether it satisfies vehicles regPattern
	//		c. Check whether it satisfies Sameer's wish.
	//		
	//		All progressively. And add the index of the 
	//		respective plate[] array to passedIndices on 
	//		satisfying conditions a, b and c.
	//
	//	4.	Print size of passedIndices
	//	5. 	Print the plates and vehicles by referencing 
	//		the indices stored in passedIndices.
	void luckyNumber(int noOfPatterns,int noOfPlates,String vehicleType[],String regPattern[],String plate[],String vehicle[]) {

		VehicleRegexMap vehicleRegexMap = new VehicleRegexMap(noOfPatterns, vehicleType, regPattern);

		ArrayList<Integer> passedIndices = new ArrayList<Integer>();

		for (int i = 0; i < noOfPlates; i++) {

			Plate plate_i = new Plate(plate[i]);

			boolean isRegistered = plate_i.isRegisteredVehicle();

			if (isRegistered) {

				System.out.print("Yes ");

				boolean satisfiesPattern = plate_i.satisfiesPattern(vehicleRegexMap.getRegArray(vehicle[i]));

				if (satisfiesPattern) {

					if (plate_i.satisfiesSameersWish()) {
						passedIndices.add(i);
					}
				}
			} else {
				System.out.println("No");
			}
		}

		System.out.println(passedIndices.size());

		for (int i = 0; i < passedIndices.size(); i++) {
			System.out.print(plate[passedIndices.get(i)]);
			System.out.print(" ");
			System.out.println(vehicle[passedIndices.get(i)]);
		}
	}
}
