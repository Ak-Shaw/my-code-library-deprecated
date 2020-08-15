import java.util.*;

class FishPopulationII{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n,nb,g,l,r;
        n = sc.nextInt();
        nb = sc.nextInt();
        g = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        

        long ans = fishPopulationII(n,nb,g,l,r);
        System.out.println(ans);
    }

    static long fishPopulationII(int n,int nb,int g,int l,int r){

        // The position of the values determines the age of the fishes. 
        // Newly born fishes will be inserted at the head.
        LinkedList<Long> fishes = new LinkedList<>();

        // Adding fishes of age 0.
        fishes.add((long)nb);

        for (int i = 0; i < n; i++) {

            long fishesThatCanGiveBirth = getSumOfAtmostFirstNElements(fishes, r);

            long newFishes = fishesThatCanGiveBirth * g;

            fishes.addFirst(newFishes);
        }

        return getSumOfAtmostFirstNElements(fishes, l);
    }

    static long getSumOfAtmostFirstNElements(LinkedList<Long> list, int n) {

        Iterator itr = list.iterator();

        int i = 0;

        long sum = 0;

        while (itr.hasNext() && i < n) {

            sum += (long)itr.next();
            i++;
        }

        return sum;
    }
}
