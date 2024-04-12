import java.sql.SQLOutput;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.getDetails();
        System.out.println("****************");
        Puppy p=new Puppy();
        p.getDetails();
    }
}
