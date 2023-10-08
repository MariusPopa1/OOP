package lab1.faculties;

public class Faculty {
    private String name;
    private String abbreviation;
    private StudyField.fieldOfStudy studyField;


    public String getName() {
        return name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public StudyField.fieldOfStudy getStudyField() {

        return studyField;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAbbreviation(String newAbbreviation) {
        this.abbreviation = newAbbreviation;
    }


    public void setStudyField(StudyField.fieldOfStudy newStudyField) {
        this.studyField = newStudyField;
    }

}
