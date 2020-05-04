/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to
rearrange them according to their CGPA in decreasing order. If two student have the
same CGPA, then arrange them according to their first name in alphabetical order. If
those two students also have the same first name, then order them according to their
ID. No two students have the same ID.

Input Format

The first line of input contains an integer N, representing the total number of
students. The next N lines contains a list of student information in the following
structure:

ID Name CGPA

Output Format

After rearranging the students according to the above rules, print the first name
of each student on a separate line.

Constraints

The name contains only lowercase English letters. The ID contains only integer
numbers without leading zeros. The CGPA will contain, at most, 2 digits after
the decimal point.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public void sortStudents(List<Student> l){

        for(int i=0;i<l.size()-1;i++)
            for(int j=0;j<l.size()-1-i;j++)
                if(l.get(j).compareTo(l.get(j+1))>0)
                    Collections.swap(l,j,j+1);

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //-----------------------------------------------------------------------
        (new Main()).sortStudents(studentList);
        //-----------------------------------------------------------------------

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
