import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TimeSlots {

    private static Scanner sc=new Scanner(System.in);

    // accepts busy time slots of person i
    public static LinkedList<Interval> timeSlots(int i){

        LinkedList<Interval> ts=new LinkedList<Interval>();

        System.out.print("\nenter no. of busy time slots for person "+i+" : ");
        int n=sc.nextInt();
        System.out.println("\nenter busy time slots of person "+i+" : \n"+
                           "time slots should be in 'x y' format where 'x y' means x-y\n");
        for(int j=0;j<n;j++){

            int si=sc.nextInt();
            int ei=sc.nextInt();

            ts.add(new Interval(si,ei));
        }

        return ts;
    }

    //finds free time slots of a person
    public static LinkedList<Interval> freeTimeSlots(LinkedList<Interval> bts, Interval its){

        LinkedList<Interval> fts=new LinkedList<Interval>();

        fts.add(new Interval(its.getSi(),bts.get(0).getSi()));

        for(int i=1;i<bts.size();i++)
            fts.add(new Interval(bts.get(i-1).getEi(),bts.get(i).getSi()));

        fts.add(new Interval(bts.get(bts.size()-1).getEi(),its.getEi()));

        return fts;
    }

    // finds mutual free time slots
    /*

    CONCEPT:
    --------

        suppose we display two pipe characters(||)
        the first one with represent starting interval
        while the second one will represent ending interval

        now, for two given interval we can have the following 13 cases:
        ---------------------------------------------------------------

        c1
        |   |
        |   |

        c2
        |       |
        |   |

        c3
        |   |
        |       |

        c4
            |   |
        |       |

        c5
        |       |
            |   |

        c6
        |           |
            |   |

        c7
            |   |
        |           |

        c8
        |       |
            |       |

        c9
            |       |
        |       |

        c10
        |   |
            |   |

        c11
        |   |
                |   |

        c12
            |   |
        |   |

        c13
                |   |
        |   |

        _________________________________________________________________________
        now suppose we call the first interval in each case A and the latter B.
        it's obvious for cases 10-13 that no slot can be arranged among them.

        if we encounter cases 10 and 11 we need to go for the next slot of A.
        for cases 12 and 13 we need to go for the next slot of B.

        for all the other cases(1-9) we are able to arrange a slot.
        now our chosen slot needs to satisfy the boundaries so we need to take
        the max of the two starting intervals (si) and the min of the two ending intervals (ei)

        if the ei of both are equal, we need to go for the next of both slots.
        if the ei of slot A is < ei of slot B, we need to go for the next of slot A.
        if the ei of slot A is > ei of slot B, we need to go for the next of slot B.

     */
    /*

    the do while loop used here fails to add the last slot so we need to
    do that at the end before returning the result

     */
    public static LinkedList<Interval> mutualFreeTimeSlots(LinkedList<Interval> s1,LinkedList<Interval> s2){

        LinkedList<Interval> ats=new LinkedList<Interval>();

        Iterator<Interval> itr1=s1.iterator();
        Iterator<Interval> itr2=s2.iterator();

        Interval slotAi=(Interval)itr1.next();
        Interval slotBi=(Interval)itr2.next();

        do{

            int ai1=slotAi.getSi();
            int ai2=slotAi.getEi();

            int bi1=slotBi.getSi();
            int bi2=slotBi.getEi();

            if(ai2<=bi1)// case 10 and 11
                slotAi=itr1.hasNext()?(Interval)itr1.next():slotAi;
            else if(ai1>=bi2)// case 12 and 13
                slotBi=itr2.hasNext()?(Interval)itr2.next():slotBi;
            else{

                // addition of arranged slot
                ats.add(new Interval(Math.max(ai1,bi1),Math.min(ai2,bi2)));

                // choosing which slot we need to look in next
                if(ai2==bi2){
                    slotAi=itr1.hasNext()?(Interval)itr1.next():slotAi;
                    slotBi=itr2.hasNext()?(Interval)itr2.next():slotBi;
                } else if(ai2<bi2)
                    slotAi=itr1.hasNext()?(Interval)itr1.next():slotAi;
                else
                    slotBi=itr2.hasNext()?(Interval)itr2.next():slotBi;

            }

        } while(itr1.hasNext()||itr2.hasNext());

        // addition of last slot
        ats.add(new Interval(Math.max(slotAi.getSi(),slotBi.getSi()),slotAi.getEi()));

        return ats;
    }
}
