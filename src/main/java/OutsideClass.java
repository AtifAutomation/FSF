import in.podtest.Animal;

public class OutsideClass {
    public static void main(String[] args) {
        Animal a2=new Animal();
        a2.a=90;
        System.out.println(a2.a);
        //'in.podtest.Animal' is not public in 'in.podtest'. Cannot be accessed from outside package

        //a2.m1();
        //'m1()' is not public in 'in.podtest.Animal'. Cannot be accessed from outside package
    }
}
