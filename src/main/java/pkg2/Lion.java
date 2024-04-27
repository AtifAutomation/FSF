package pkg2;

import pkg1.Animal;

public class Lion extends Animal{
    public static void main(String[] args) {
        Animal obj5=new Animal();
        obj5.name="XYZ";
        System.out.println(obj5.name);
//        obj5.age=56; //'age' has private access in 'pkg1.Animal'
//        System.out.println(obj5.age); //'age' has private access in 'pkg1.Animal'
        //obj5.gender="Female"; //'gender' has protected access in 'pkg1.Animal'
        //obj5.id=78; //'id' is not public in 'pkg1.Animal'. Cannot be accessed from outside package
        Lion l1=new Lion();
        l1.name="hjy";
        System.out.println(l1.name);
        l1.gender="female";
        System.out.println(l1.gender);
        l1.id=98;//id' is not public in 'pkg1.Animal'. Cannot be accessed from outside package

    }

}
