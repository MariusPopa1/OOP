package Lab1;

import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private Date enrolmentDate;
    private Date dateOfBirth;
    private Boolean graduated;

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getEmail() {

        return email;
    }

    public Date getEnrolmentDate() {

        return enrolmentDate;
    }

    public Date getDateOfBirth() {

        return dateOfBirth;
    }

    public Boolean getGraduated() {

        return graduated;
    }

    public void setFirstName(String newFirstName) {

        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {

        lastName = newLastName;
    }

    public void setEmail(String newEmail) {

        email = newEmail;
    }

    public void setEnrolmentDate(Date newEnrolmentDate) {

        enrolmentDate = newEnrolmentDate;
    }

    public void setDateOfBirth(Date newDateOfBirth) {

        dateOfBirth = newDateOfBirth;
    }

    public void setGraduated(Boolean newGraduated) {

        graduated = newGraduated;
    }
}
