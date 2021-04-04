package student_db_app;

import java.util.Scanner;

public class StudentDBapp {

    public static void main(String[] args) {



        // Ask how many new users we want to add
        System.out.print("Enter number of stdents to enrol: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n numb of new students
        for(int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].paytuition();

        }

        for(int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].showinfo());
        }

    }

}