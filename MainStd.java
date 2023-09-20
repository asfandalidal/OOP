import java.util.ArrayList;
public class MainStd {
    public static void main(String[] args) {
        ArrayList<UniversityStudent> studentList = new ArrayList<UniversityStudent>();
        UniversityStudent student1 = new UniversityStudent("Asfand Ali", 20, 12, "22SW041", "Software Engineering","2nd");
        UniversityStudent student2 = new UniversityStudent("Usaid Bajwa", 20, 12, "23D-Ph092", "D-Pharma","2nd");
        UniversityStudent student3 = new UniversityStudent("Abdul Wali", 18, 12, "23SW110", "Software Engineering","1st");
        UniversityStudent student4 = new UniversityStudent("Hasnain", 18, 12, "23CS35", "Computer Science","3rd");
        UniversityStudent student5 = new UniversityStudent("Jawad", 20, 12, "22Ch018", "Chemical Engineering","4rth");
        UniversityStudent student6 = new UniversityStudent("Aijaz", 20, 12, "22BM008", "Bio-Medical Engineering","8th");
        UniversityStudent student7 = new UniversityStudent("Muzammil", 20, 12, "23CPT002", "Crop Protection","5th");

        // Add students to the studentList
        UniversityStudent.AddStudents(studentList, student1);
        UniversityStudent.AddStudents(studentList, student2);
        UniversityStudent.AddStudents(studentList, student3);
        UniversityStudent.AddStudents(studentList, student4);
        UniversityStudent.AddStudents(studentList, student5);
        UniversityStudent.AddStudents(studentList, student6);
        UniversityStudent.AddStudents(studentList, student7);
        
        // Search for a student by name in studentList
        // UniversityStudent.searchStudentName(studentList, "jawadd");
        // UniversityStudent.DeptNameforStudentList(studentList, "Chemical Engineering");
        // UniversityStudent.AverageAgeStudents(studentList);
        UniversityStudent.removeStudent(studentList, "Aijaz");
        UniversityStudent.displayStudentList(studentList);

    }
}