package lab1.faculties;

public class FacultyDisplayer {

    public void facultyView(Faculty f) {
            System.out.println("Faculty name: " + f.getName());
            System.out.println("Last abbreviation: " + f.getAbbreviation());
            System.out.println("Faculty study field: " + f.getStudyField());
            System.out.println();
    }
}