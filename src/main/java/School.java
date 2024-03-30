public class School {
    String schoolName;
    String schoolAddress;
    String schoolprincipalName;
    int schoolteacherCount;
    int studentCount;
    public void displayResult()
    {
        System.out.println("Every student passed with flying colors");
    }
    public void displaySchoolDetails()
    {
        System.out.println("School name is :"+" "+schoolName);
        System.out.println("School address is :"+" "+schoolAddress);
        System.out.println("Principal name is :"+" "+schoolprincipalName);
        System.out.println("Teacher count is :"+" "+schoolteacherCount);
    }
}
