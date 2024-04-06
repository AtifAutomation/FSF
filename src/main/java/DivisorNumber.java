public class DivisorNumber {
    public static void main(String[] args) {
        divisorNumber(-36);

    }

    public static void divisorNumber(int num)
    {
        if(num<0)
        {
            System.out.println("Please enter positive number..");
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.print(i+"  ");
                }
            }
        }

    }

}
