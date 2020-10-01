package questionB.solution;

public class Rank extends Record {
    
    int index;

    Rank(int numberOfStudents) {
        super(numberOfStudents);
        this.index = 0;
    }

    public void highest() {

        for (int i = 1; i < this.numberOfStudents; i++) {
            if (this.rnk[i] < this.rnk[this.index]) {
                this.index = i;
            }
        }
    }

    @Override
    public void display() {
        
        super.display();
        this.highest();
        System.out.println("\n\nName having topmost rank: " + this.name[this.index]);
    }
}