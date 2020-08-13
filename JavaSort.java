//https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=false
import java.util.*;

public class JavaSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // read in number of students
        int n = Integer.parseInt(sc.nextLine());
        String input = new String();

        // create arraylist of students
        ArrayList<Student> students = new ArrayList<Student>();

        while(n > 0) {
            input = sc.nextLine();
            String details[] = input.split(" ");

            // create new student and add to list
            Student student = new Student(details[1], Float.parseFloat(details[2]));
            students.add(student);
            n--;
        }

        // sort list of students
        Collections.sort(students);

        // print out student names after sorting
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private float cpga; 

    public Student (String name, float cpga) {
        this.name = name;
        this.cpga = cpga;
    }

    public String getName() {
        return name;
    }

    // override sorting to fit requirements
    @Override
    public int compareTo(Student other) {
        if (other.cpga > cpga) 
            return 1;
        else if (other.cpga < cpga)
            return -1;
        else 
            return name.compareTo(other.getName());
    }
}
