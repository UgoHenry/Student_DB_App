package student_db_app;


import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int  tuitionBalance = 0;
    private static int costofcourse  = 600;
    private static int id = 1000;


    //constructor prompts student to enter name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student firstName: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student lastName: ");
        this.lastName = in.nextLine();

        System.out.print("1-fresher\n2 sopho\n3 junior\n4 Senior\n Enter Student level:");
        this.gradeYear = in.nextInt();
        setStudentID();
        //System.out.println(firstName + " "+ lastName +" "+ studentID);


    }
    //generate an ID
    private void setStudentID() {
        //grade year + ID
        id++;
        this.studentID = gradeYear +""+ id;

    }
    //Enroll in courses
    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to Quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costofcourse;

            }
            else { break;
            }

        } while (1 != 0);

        //System.out.println("Enrolled in: "+ courses );
        //System.out.println("Tuition balance:" + tuitionBalance);

    }
    //view balance
    public void viewbalance() {
        System.out.println("Your balance is: $" + tuitionBalance );
    }
    //pay tuition
    public void paytuition() {
        viewbalance();
        System.out.print("Enter your payment $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payments of  $" + payment);
    }
    //show status
    public String showinfo() {
        return "Name:" + firstName + "  "+ lastName +
                "\n Grade level: " + gradeYear +
                "\n Student ID: " + studentID +
                "\n Courses Enrolled: "+ courses +
                "\n Balance: $"+ tuitionBalance;
    }
}
