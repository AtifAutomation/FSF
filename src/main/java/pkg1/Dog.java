package pkg1;

public class Dog extends Animal{
    public static void main(String[] args) {
        Animal obj3=new Animal();
        obj3.name="Rakesh";
        System.out.println(obj3.name);
        obj3.gender="Male";
        System.out.println(obj3.gender);
        obj3.id=23;
        System.out.println(obj3.id);
//        obj3.age=34; //'age' has private access in 'pkg1.Animal'
//        System.out.println(obj3.age);
        Dog d1=new Dog();
        d1.name="Monkey";
        System.out.println(d1.name);
        d1.gender="Female";
        System.out.println(d1.gender);
        d1.id=56;
        System.out.println(d1.id);




    }


}
