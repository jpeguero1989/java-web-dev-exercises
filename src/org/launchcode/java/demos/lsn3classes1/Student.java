package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //name setter
    public void setName(String aName)
    {
       name = aName;
    }

    //name getter
    public String getName()
    {
        return name;
    }

    //studentId setter
    public void setStudentId(int aStudentId)
    {
        studentId = aStudentId;
    }

    //studentId getter
    public int getStudentId()
    {
        return studentId;
    }

    //numberOfCredits setter
    public void setNumberOfCredits(int aNumberOfCredits)
    {
        numberOfCredits = aNumberOfCredits;
    }

    //numberOfCredits getter
    public int getNumberOfCredits()
    {
        return numberOfCredits;
    }

    //gpa setter
    public void setGPA(double aGPA)
    {
        gpa = aGPA;
    }

    //gpa getter
    public double getGPA()
    {
        return gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = gpa  * numberOfCredits;
        double totalQualityScore= (grade * courseCredits) + currentQualityScore;
        int totalNumberOfCredits = courseCredits + numberOfCredits;
        numberOfCredits = totalNumberOfCredits;
        gpa = totalQualityScore / totalNumberOfCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if ((this.numberOfCredits >= 0) && (this.numberOfCredits <= 29))
        {
            return "Freshman";
        }

        else if ((this.numberOfCredits >= 30) && (this.numberOfCredits <= 59))
        {
            return "Sophomore";
        }

        else if ((this.numberOfCredits >= 60) && (this.numberOfCredits <= 89))
        {
            return "Junior";
        }
        else
        {
            return "Senior";
        }

    }

}