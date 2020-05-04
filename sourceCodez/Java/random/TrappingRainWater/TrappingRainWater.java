import java.io.*;
import java.util.*;
class TrappingRainWater {

    // complete the below function implementation
    public int trap(int[] height) {
        
        int startingIndex=getStartingIndex(height, 0);

        int endingIndex=getEndingIndex(height);

        if(startingIndex==-1 || endingIndex==-1|| startingIndex>endingIndex)
            return 0;

        int waterTrapped=0;

        int lastRightBoundary=0;

        while(startingIndex<=endingIndex && startingIndex!=-1){

            int leftBoundary=getLeftBoundary(height, startingIndex, lastRightBoundary);

            int rightBoundary=getRightBoundary(height, startingIndex, leftBoundary);

            if(rightBoundary==-1){
                startingIndex++;
                continue;
            }

            lastRightBoundary=rightBoundary;

            int waterTrappedBetweenBoundaries=getWaterTrappedBetweenBoundaries(height, leftBoundary, rightBoundary);

            waterTrapped+=waterTrappedBetweenBoundaries;

            startingIndex=getStartingIndex(height, rightBoundary);

        }

        
        return waterTrapped;
    }

    public int getWaterTrappedBetweenBoundaries(int[] height, int leftBoundary, int rightBoundary){

        int waterLevel=Math.min(height[leftBoundary], height[rightBoundary]);

        int waterTrappedBetweenBoundaries=0;

        for(int i=leftBoundary+1; i<rightBoundary; i++){
            waterTrappedBetweenBoundaries+=waterLevel-height[i];
        }

        return waterTrappedBetweenBoundaries;

    }

    public int getRightBoundary(int[] height, int startingIndex, int leftBoundary){

        int rightBoundary=-1;

        int i=startingIndex+1;

        int max=i;

        int dropIndex=startingIndex;

        while(i<height.length){

            if(height[i]>=height[leftBoundary])
                break;

            if(height[i]>height[max])
                max=i;

            if(height[i]<height[max])
                dropIndex=i;

            i++;

        }

        if(i<height.length){
            rightBoundary=i;
        }

        if(rightBoundary==-1){

            if(dropIndex>max && height[max]>height[startingIndex]){

                rightBoundary=max;

            }

            if(max==height.length-1 && height[max]>height[startingIndex]){

                rightBoundary=max;

            }

        }

        return rightBoundary;

    }

    public int getLeftBoundary(int[] height, int startingIndex, int leftLimit){

        int leftBoundary=startingIndex-1;

        int i=startingIndex-1;

        while(i>=leftLimit){

            if(height[i]>height[leftBoundary])
                leftBoundary=i;

            i--;

        }

        return leftBoundary;

    }

    public int getEndingIndex(int[] height){

        int endingIndex=-1;
        int i;

        for(i=height.length-1; i>1; i--){

            if(height[i-1]<height[i])
                break;

        }

        if(i>1){
            endingIndex=i-1;
        }

        return endingIndex;

    }

    public int getStartingIndex(int[] height, int i){

        int startingIndex=-1;

        for(; i<height.length-1; i++){

            if(height[i+1]<height[i])
                break;

        }

        if(i<height.length-1){
            startingIndex=i+1;
        }

        return startingIndex;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new TrappingRainWater().trap(height);
        System.out.println(result);
    }
}
