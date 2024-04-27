package pkg1;

public class Animal {
    public String name;
    private int age;
    protected String gender;
    int id;

    public void methodAnimalAccessor()
    {
        System.out.println("Name is "+name+" "+"age "+age+" "+"Gender "+" "+gender+" "+"Id is "+id);
    }

    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.name="Atif";
        System.out.println(obj.name);
        obj.age=25;
        System.out.println(obj.age);
        obj.gender="Male";
        System.out.println(obj.gender);
        obj.id=001;
        System.out.println(obj.id);


    }

}
