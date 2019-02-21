/* Program to prompt user to input grades of students and check if its in a particular range*/
package com.stackroute.PE3;

public class StudentMarks {

    public String check(int stuGrades[], int numOfStudents) {
        for (int i = 0; i < numOfStudents; i++)

            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return "Error";
            }

        return "All marks are correct";
    }
}
