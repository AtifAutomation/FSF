package javaClassObject;


public class BaseClass {
    public static void main(String[] args) {
        School sc1=new School();
        sc1.schoolName="Delhi Public javaClassObject.School";
        sc1.schoolAddress="Kolkata";
        sc1.principalName="Peter";
        sc1.studentCount=200;
        sc1.teacherCount=20;
        Teacher t1=new Teacher();
        t1.subjectName="English";
        t1.teacherName="Daniel";
        Teacher t2=new Teacher();
        t2.teacherName="Ram";
        t2.subjectName="Physics";
        Student st1=new Student();
        st1.age=12;
        st1.name="Amit";
        Student st2=new Student();
        st1.age=15;
        st1.name="Asim";
        Student st3=new Student();
        st3.age=13;
        st3.name="Rana";
        Student st4=new Student();
        st4.age=11;
        st1.name="Ajit";
        Classroom c1=new Classroom();
        c1.floorNumber=1;
        c1.seatingCapacity=50;
        Classroom c2=new Classroom();
        c2.floorNumber=2;
        c2.seatingCapacity=50;
        Classroom c3=new Classroom();
        c3.floorNumber=3;
        c3.seatingCapacity=50;
        sc1.displayResult();
        sc1.displayStudentCount();

    }
}
