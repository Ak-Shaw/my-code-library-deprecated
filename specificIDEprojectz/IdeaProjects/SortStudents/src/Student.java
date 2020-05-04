class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student s){

        double cgpa1=this.getCgpa();
        double cgpa2=s.getCgpa();

        int c=(int)((cgpa2-cgpa1)*1000);

        if(c!=0)
            return c;

        String fname1=this.getFname();
        String fname2=s.getFname();

        c=fname1.compareTo(fname2);

        if(c!=0)
            return c;

        int id1=this.getId();
        int id2=s.getId();

        return(id1-id2);
    }
}