import javax.swing.plaf.basic.BasicTreeUI;

public class BaseClassSchool {
    public static void main(String[] args) {
        System.out.println("***** School Details *****");
        School sc1=new School();
        sc1.schoolName="NES";
        sc1.teacherCount=50;
        sc1.studentCount=200;
        sc1.principalName="Daniel";
        sc1.address="Kolkata";
        sc1.displayResult();
        System.out.println("***** Teacher Details *****");
        Teacher t1=new Teacher();
        t1.teacherName="Ram";
        t1.teachesSubject="Math";
        //t1.teach();
        Teacher t2=new Teacher();
        t2.teacherName="Ayush";
        t2.teachesSubject="English";
        t2.teach();
        System.out.println("***** Student Details *****");
        Student s1=new Student();
        s1.name="Ajit";
        s1.age=14;
        s1.eat();
        //s1.play();
        //s1.read();
        Student s2=new Student();
        s2.name="Sana";
        s2.age=12;
        //s2.eat();
        s2.play();
        s2.read();
        System.out.println("***** Classroom Details *****");
        ClassRoom c1=new ClassRoom();
        c1.classFloorNumber=1;
        c1.seatingCapacity=50;
        //c1.classClean();
        ClassRoom c2=new ClassRoom();
        c2.classFloorNumber=2;
        c2.seatingCapacity=50;
        //c2.classClean();
        ClassRoom c3=new ClassRoom();
        c3.classFloorNumber=3;
        c3.seatingCapacity=50;
        c3.classClean();

    }
}
