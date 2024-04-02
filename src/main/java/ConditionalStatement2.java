public class ConditionalStatement2 {
    public static void main(String[] args) {
        ConditionalStatement2 c1=new ConditionalStatement2();
        c1.switchDemo(180);
        c1.switchDemo2("Femaleee");
        c1.swithDemo3('B');
    }
    public void switchDemo(int age)
    {
        switch(age)
        {
            default:
            {
                System.out.println("You are young..");
                break;
            }
            case 18:
            {
                System.out.println("You are adult..");
                break;
            }
            case 60:
            {
                System.out.println("You are Senior Citizen..");
                break;

            }




        }
    }

    //float long double  are accepted in switch
    public void switchDemo2(String gender)
    {
        switch(gender)
        {
            case "Male":
                System.out.println("Male ...");
                break;
            case "Female":
                System.out.println("Female...");
                break;
            default:
                System.out.println("enter correct gender");
                break;
        }
    }

    //float long double char are accepted in switch

    public void swithDemo3(char ch)
    {
        switch(ch)
        {
            case 'A':
                System.out.println("A character");
                break;
            case 'B':
                System.out.println("B character");
                break;
            default:
                System.out.println("Default block..");
                break;
        }
    }

    //boolean float long double  are not accepted in switch statement
    // compilation error
    //Incompatible types. Found: 'float', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'

    public void switchDemo4(float f)
    {
        switch(f)
        {

        }
    }

}
