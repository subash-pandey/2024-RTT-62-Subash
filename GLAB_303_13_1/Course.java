package GLAB_303_13_1;

public class Course {
    private String code;
    private String courseName;
    private String instructor;

    public Course() {
    }

    public Course(String code, String courseName, String instructor) {
        this.code = code;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
