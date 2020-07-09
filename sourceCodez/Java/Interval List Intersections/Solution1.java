class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        int i = 0, j = 0;
        
        ArrayList<Interval> intersectionResults = new ArrayList<>();
        
        while (i < A.length && j < B.length) {
            
               Interval intersection = getIntersection(new Interval(A[i][0], A[i][1]), new Interval(B[j][0], B[j][1]));
            
            if (!(intersection == null))
                intersectionResults.add(intersection);
            
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }
        
        int[][] results = new int[intersectionResults.size()][2];
        
        for (int k = 0; k < intersectionResults.size(); k++) {
            
            results[k][0] = intersectionResults.get(k).si;
            results[k][1] = intersectionResults.get(k).ei;
        }
        
        return results;
    }
    
    public Interval getIntersection(Interval interval1, Interval interval2) {
        
        if (interval1.ei < interval2.si) 
            return null;
        
        if (interval1.si > interval2.ei)
            return null;
        
        Interval intersection = new Interval();
        
        intersection.si = interval1.si >= interval2.si ? interval1.si : interval2.si;
        intersection.ei = interval1.ei <= interval2.ei ? interval1.ei : interval2.ei;
        
        return intersection;
    }
}

class Interval {

    //starting interval
    int si;

    //ending interval
    int ei;
    
    public Interval() {}

    public Interval(int si, int ei) {
        this.si = si;
        this.ei = ei;
    }
    
    public String toString() {
        return "[" + si+", " + ei + "]";
    }
}

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

    */
    