package lab1.faculties;

import java.util.Scanner;


public class FacultyCreation {

    public Faculty createFaculty() {
        Faculty faculty = new Faculty();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the faculty: ");
        faculty.setName(scanner.nextLine());

        System.out.println("Enter the abbreviation of the faculty: ");
        faculty.setAbbreviation(scanner.nextLine());

        System.out.println("Select the number of the study field for the faculty:");
        System.out.println("1. CHEMICAL_ENGINEERING\n2. SOFTWARE_ENGINEERING\n3. FOOD_TECHNOLOGY\n4. LAW\n5. ECONOMICS");
        int fieldChoice = scanner.nextInt();
        switch (fieldChoice) {
            case 1 -> faculty.setStudyField(StudyField.fieldOfStudy.CHEMICAL_ENGINEERING);
            case 2 -> faculty.setStudyField(StudyField.fieldOfStudy.SOFTWARE_ENGINEERING);
            case 3 -> faculty.setStudyField(StudyField.fieldOfStudy.FOOD_TECHNOLOGY);
            case 4 -> faculty.setStudyField(StudyField.fieldOfStudy.LAW);
            case 5 -> faculty.setStudyField(StudyField.fieldOfStudy.ECONOMICS);

        }

        return faculty;
    }
}