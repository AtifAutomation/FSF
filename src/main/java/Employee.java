public class Employee {
    /*
      As per requirement specifications this class has 5 instance variable and 2 method
     */
    String name;
    int age;
    private float empSalaryMonthly;
    int empID;
    boolean isActive;
    // Creating constructor to assign values to the instance variable of the class.
    //Use Constructor in Employee class to assign values to the instance variable
    public Employee(String name,int age,float empSalaryMonthly,int empID,boolean isActive)
    {
        this.name=name;
        this.age=age;
        this.empSalaryMonthly=empSalaryMonthly;
        this.empID=empID;
        this.isActive=isActive;

    }
    /*
        We need to pass Object reference of Organization class to access all the employee under it
        and print required details.
     */
    public void getDetails(Organization PodTest)
    {
        for(Employee e:PodTest.employee)
        {
            System.out.println("Name :"+e.name+" "+"Employee id "+e.empID+"Age is "+e.age);
        }

    }
    public float getTaxAmountTobePaid()
    {
        float taxAmount=0;
            if(empSalaryMonthly>100000)
            {
                taxAmount=taxAmount+(float) (empSalaryMonthly * 0.20);
            }
            else
            {
                System.out.println("No tax to be Paid "+name);
            }


        return taxAmount;

    }
    public float getEmpSalary()
    {
        return empSalaryMonthly;
    }
}
