import java.util.ArrayList;

import java.util.Iterator;

class UniversityStudent extends CollegeStudent {
    String rollNo;
    String deptName;
    String semester;

    public UniversityStudent(String name, int age, int minEdu, String rollNo, String deptName,String semester) {
        super(name, age, minEdu);
        this.deptName = deptName;
        this.rollNo = rollNo;
        this.semester=semester;
    }
    public void setSemester(String semester)
    {
        this.semester=semester;
    }
    public String getSemesterName()
    {
        return semester;
    }

    public String getRollNo() {
        return rollNo;
    }
     public void setDeptName(String deptName) {
        this.deptName=deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public static void AddStudents(ArrayList<UniversityStudent> studentList, UniversityStudent student) {
        studentList.add(student);
    }

    public static void searchStudentName(ArrayList<UniversityStudent> studentList, String name) {
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equalsIgnoreCase(name)) {
                found = true;
                break; // Exit the loop as soon as the name is found
            }
        }

        if (found) {
            System.out.println("\nStudent(s) name is found!");
        } else {
            System.out.println("\nStudent(s) name is not found!");
        }
    }
    public static void displayStudentList(ArrayList<UniversityStudent> studentList)
    {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print("\n" +
                    "The name of the student : " + studentList.get(i).getName() +
                    "\nAge : " + studentList.get(i).getAge() +
                    "\nMinimum Education : " + studentList.get(i).getMinEdu() +
                    "\nDepartment Name : " + studentList.get(i).getDeptName() +
                    "\nRoll No : " + studentList.get(i).getRollNo() + "\n"
                    +"Semester Studying : "+studentList.get(i).getSemesterName()+"\n***************************************");
        }
    }
    public static void DeptNameforStudentList(ArrayList<UniversityStudent> studentList, String deptName)
    {
        ArrayList <String> studentListdept=new ArrayList<>();
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getDeptName().equalsIgnoreCase(deptName)) {
                found = true;
                studentListdept.add(studentList.get(i).getName());
                 // Exit the loop as soon as the name is found
            }
        }

        if (found) {
            System.out.println("\nStudent(s) names with same department are found!");
            for(int i=0;i<studentListdept.size();i++)
            {
                System.out.println(studentListdept.get(i));
            }
        } else {
            System.out.println("\nStudent(s) names with same department are not found!");
        }
    }
        public static void AverageAgeStudents(ArrayList<UniversityStudent> studentList)
    {
        int sum=0;
        int AvgAge=0;
        ArrayList <String> studentListdept=new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            sum+=studentList.get(i).getAge();
            AvgAge=(sum/studentList.size());
        }
        System.out.println("The average age of the students is "+ AvgAge);
    }
    public static void removeStudent(ArrayList<UniversityStudent> studentList, String name) {
        // Iterate through the list to find and remove the student
        Iterator<UniversityStudent> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            UniversityStudent student = iterator.next();
            if (student.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Student " + name + " has been removed.");
            }
        }
    }
    public static void updateStudentInfo(ArrayList<UniversityStudent> studentList, String name, int age, String deptName) {
        for (UniversityStudent student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.setAge(age);
                student.setDeptName(deptName);
                System.out.println("Student " + name + " has been updated.");
            }
        }
    }
    
    
}