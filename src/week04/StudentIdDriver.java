package week04;

import java.util.Scanner;
/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 10:53 PM
 */
public class StudentIdDriver {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        StudentId student;
        String name;
        student = new StudentId();
        System.out.println("Enter student name: ");
        name = stdIn.nextLine();
        student.setName(name);
        System.out.println("Enter student id: ");
        student.setId(stdIn.nextInt());
        while (student.isValid() == false) {
            System.out.println("Invalid student id -reenter: ");
            student.setId(stdIn.nextInt());
        }
        System.out.println("\n" + name + ", your new e-mail account is: \n" + student.getEmailAccount());
    }
}
