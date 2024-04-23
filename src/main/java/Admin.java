public class Admin {
    /*
      As per requirement specifications it has 1 instance variable and 3 methods.
     */
    String role;
    public Admin(String role)
    {
        this.role=role;
    }
    public float getTotalReqdBudget(Organization Podtest)
    {
        float totalBudget=0;
        for(Employee e:Podtest.employee)
        {
            if(e.isActive==true)
            {
                totalBudget=totalBudget+e.getEmpSalary();
            }
        }
        return totalBudget;
    }
    public float getTotalTaxCollected(Organization Podtest)
    {
        float totalTax=0;
        for(Employee e:Podtest.employee)
        {
            if(e.isActive==true)
            {
                totalTax=totalTax+e.getTaxAmountTobePaid();
            }
        }
        return totalTax;

    }
    public void printTaxAmountPerEmployees(Organization Podtest)
    {
        for(Employee e:Podtest.employee)
        {
            if(e.isActive==true)
            {
                System.out.println("Tax to be paid for "+e.name+" "+e.getTaxAmountTobePaid());;
            }
        }


    }
}
