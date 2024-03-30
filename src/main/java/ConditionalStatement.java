public class ConditionalStatement {
    public static void main(String[] args) {
        ConditionalStatement c1=new ConditionalStatement();
       String res=c1.determineCategory(19,"Male");
        System.out.println(res);

    }

    public String determineCategory(int age,String gender)
    {
        String result=null;
        if((age>0) && (age <=18))
        {
            if(gender=="Male")
            {
                result="boy";
            }
            else if(gender=="Female")
            {
                result="girl";
            }

        }
        else if((age>18) && (age <=60))
        {
            if(gender=="Male")
            {
                result="man";
            }
            else if(gender=="Female")
            {
                result="woman";
            }
        }
        else if(age>60)
        {
            result="sc";
        }
        else
        {
            result="Enter correct age and gender";
        }

        return result;
    }
}
