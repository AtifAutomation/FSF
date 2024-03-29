public class ConditionalStatement {
    public static void main(String[] args) {
        ConditionalStatement c1=new ConditionalStatement();
       String res=c1.determineCategory(61,"Male");
        System.out.println(res);

    }

    public String determineCategory(int age,String gender)
    {
        String result=null;
        if((age>0) && (age <=18) && (gender=="Male"))
        {
            result="boy";
        }
        else if((age>18) && (age <=60) && (gender=="Male"))
        {
            result="man";
        }
        else if(age>60 )
        {
            result="sc";
        }
        else if((age>0) && (age <=18) && (gender=="Female"))
        {
            result="girl";
        }
        else if((age>=18) && (age <=60) && (gender=="Female"))
        {
            result="woman";
        }
        else {
            result="Enter correct age and gender";
        }
        return result;
    }
}
