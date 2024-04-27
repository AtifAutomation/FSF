package pkg2;

import pkg1.Animal;

public class AccesAnimal {
    public static void main(String[] args) {
        Animal obj6=new Animal();
        obj6.name="tyr";
        System.out.println(obj6.name);
        obj6.age=56;
        obj6.gender="female";
        obj6.id=34;
    }
}
