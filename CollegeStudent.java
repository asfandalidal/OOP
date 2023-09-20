public class CollegeStudent extends Student{
    int minEdu;
    CollegeStudent(String name,int age,int minEdu)
    {
        super(name,age);
        this.minEdu=minEdu;
    }
    public int getMinEdu()
    {
        return minEdu;
    }


}



