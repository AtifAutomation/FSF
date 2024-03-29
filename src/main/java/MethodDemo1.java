public class MethodDemo1 {
    //System.out.println("Hello"); //java: <identifier> expected
    int x=10; // declaring and intializing

    int b; //declaring


    //d1.x=90; // Not allowed
    public static void main(String[] args) {
        MethodDemo1 d1=new MethodDemo1();
        System.out.println("------Method with return type------");
        System.out.println(d1.squareNumber(2,5));
        System.out.println(d1.squareNumber(10,10));
        System.out.println("----- Method without return type----");
        d1.squareNumberPrint(2,5);
        System.out.println(Math.pow(10,2));
//        d1.x=90;
//        d1.b=50;
//        d1.m1();
    }

    public void m1()
    {

        System.out.println(x);
        System.out.println(b);
    }
    // Finding the square of a number (a+b)^2

    // Method with return keyword
    public int squareNumber(int num1,int num2)
    {
        int result=(num1*num1)+(num2*num2)+(2*num1*num2);

        return result;
    }
    // Method without return keyword
    public void squareNumberPrint(int num1,int num2)
    {
        int result=(num1*num1)+(num2*num2)+(2*num1*num2);
        System.out.println(result);
    }



}
