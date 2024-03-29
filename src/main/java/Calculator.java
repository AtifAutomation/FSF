public class Calculator {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println("---Addition----");
        System.out.println(c1.addition(5,5));
        System.out.println("---Division----");
        System.out.println(c1.division(5,5));
        System.out.println("---Subtraction----");
        System.out.println(c1.subtraction(10,5));
    }

    // Addition functionality
    public int addition(int num1,int num2)
    {
        int result=num1+num2;
        return result;
    }
    //Subtraction functionality
    public int subtraction(int num1,int num2)
    {
        int result=num1-num2;
        return result;
    }
    //Division functionality
    public float division(float num1,float num2)
    {
        float result=num1/num2;
        return result;

    }

}
