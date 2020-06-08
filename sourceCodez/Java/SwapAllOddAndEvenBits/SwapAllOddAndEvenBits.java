import java.io.*;
import java.util.*;

class SwapAllOddAndEvenBits {

    public long swapBits(long n) {

        // Get all even bits of x 
        long even_bits = n & 0xAAAAAAAAAAAAAAAAl;  
      
        // Get all odd bits of x 
        long odd_bits = n & 0x5555555555555555l;  
      
        // Right shift even bits 
        even_bits >>= 1;  
          
        // Left shift even bits 
        odd_bits <<= 1;  
          
        // Combine even and odd bits 
        return (even_bits | odd_bits);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long result = new SwapAllOddAndEvenBits().swapBits(n);
        System.out.println(result);
    }
}
