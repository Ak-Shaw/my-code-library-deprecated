import java.io.*;
import java.util.*;

class NextNumber {
    // Complete the below functions
    public long nextGreater(long n) {

        int NumOfZeroBitsRightOfZeroBit = 0;
        int NumOfOneBitsRightOfZeroBit = 0;

        long temp = n;
        while (((temp & 1) == 0) && (temp != 0)) {

        	NumOfZeroBitsRightOfZeroBit++;
        	temp >>= 1;
        }

        while ((temp & 1) == 1) {

        	NumOfOneBitsRightOfZeroBit++;
        	temp >>= 1;
        }

        if (NumOfZeroBitsRightOfZeroBit + NumOfOneBitsRightOfZeroBit == 63 
        	|| NumOfZeroBitsRightOfZeroBit + NumOfOneBitsRightOfZeroBit == 0) 
        	return -1;

        int ZeroBitPosition = NumOfZeroBitsRightOfZeroBit + NumOfOneBitsRightOfZeroBit;

        n = setBit(n, ZeroBitPosition);
        n = clearAllLowerBits(n, ZeroBitPosition);
        n = insertOneBitsAtLowerEnd(n, NumOfOneBitsRightOfZeroBit - 1);

        return n;
    }

    public static long setBit(long num, int bitNumber) {
    	return num |= ((long)1 << bitNumber);
    }

    public static long clearAllLowerBits(long num, int bitNumber) {

    	num &= ~(((long)1 << bitNumber) - 1);
    	return num;
    }

    public static long insertOneBitsAtLowerEnd(long num, int numberOfBits) {

    	num |= ((long)1 << numberOfBits) - 1;
    	return num;
    }

    public static long insertNumOneBitsAtPosition(long num, int numBits, int bitNumber) {

    	long mask = ((long)1 << (numBits)) - 1;

    	num |= mask << (bitNumber);

    	return num;
    }

    public long nextSmaller(long n) {

        int NumOfZeroBitsRightOfOneBit = 0;
        int NumOfOneBitsRightOfOneBit = 0;

        long temp = n;

        while ((temp & 1) == 1) {

        	NumOfOneBitsRightOfOneBit++;
        	temp = temp >> 1;
        }

        if (temp == 0)
        	return -1;

        while (((temp & 1) == 0) && (temp != 0)) {
        	NumOfZeroBitsRightOfOneBit++;
        	temp = temp >> 1;
        }

        int OneBitPosition = NumOfZeroBitsRightOfOneBit + NumOfOneBitsRightOfOneBit;

        n = clearAllLowerBits(n, OneBitPosition + 1);
        n = insertNumOneBitsAtPosition(n, NumOfOneBitsRightOfOneBit + 1, NumOfZeroBitsRightOfOneBit - 1);

        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long greater = new NextNumber().nextGreater(n);
        long smaller = new NextNumber().nextSmaller(n);
        System.out.println(greater);
        if (smaller == -1) {
            System.out.println("No Number");
        } else {
            System.out.println(smaller);
        }
    }
}
