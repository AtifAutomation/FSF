package in.podtest;

public class Animal {
    public int a; // instance variable
    public static void main(String[] args) {
        Animal a3=new Animal();
        //a3.m1();
        //System.out.println(a);
        a3.printInstanceVariable(10);
    }

    private void m1()
    {
        System.out.println("Animal-m1");
    }
    public void printInstanceVariable(int b)
    {

        System.out.println(a);
        System.out.println(b);
    }


}
