public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(-1230));
        //System.out.println(5%10);
    }

    public static int reverseNumber(int num)
    {
        // Any number modulas 10 will result same number
        // Any number divide 10 will  result 0
        int reverse=0;

            while(num!=0) // 123 12
            {
                int rem=num%10;  // 3 2 1

                reverse=reverse *10 + rem;  // 3 32 321

                num=num/10; // 12 1 0

            }

        if(num<0)
        {
            reverse=reverse*-1;
        }
        return reverse;
    }
}
