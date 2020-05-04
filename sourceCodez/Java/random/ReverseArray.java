// Here we reverse the initialized array by passing
// it to the reverse() method, which works
// by swappin the front-end elements with the back-end
// elements and continues the procedure till it 
// reaches the middle.

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array={1,5,3,7,11,9,15};

        System.out.println("Array = "+Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = "+Arrays.toString(array));
    }

    private static void reverse(int[] array){

        int maxIndex=array.length-1;
        int halfLength=array.length/2;
        for(int i=0;i<halfLength;i++){

            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}