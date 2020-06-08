import java.io.*;
import java.util.*;

class Conversion {

    public int countConversionBits(long a, long b) {

        int conversionBits = 0;

        while (a != 0 && b != 0) {

            if ( (a & 1) != (b & 1)) {

                conversionBits++;
            }

            a >>= 1;
            b >>= 1;
        }

        conversionBits += countNumberOfOneBits(a);

        conversionBits += countNumberOfOneBits(b);

        return conversionBits;
    }

    public int countNumberOfOneBits(long num) {

        int count = 0;

        while (num != 0) {

            if ((num & 1) == 1) {

                count++;
            }

            num >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        int result = new Conversion().countConversionBits(a, b);
        System.out.println(result);
    }
}
