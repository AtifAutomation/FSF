public class Organization {
    /*
      As per requirement specification it has 2 instance variable and 1 method
        NoOfEmployees;
        Employee employee[];
        printEmployeeDetailsAll()
     */
    int NoOfEmployees;
    // Custom array
    Employee employee[];
    public Organization(int NoOfEmployees)
    {
        this.NoOfEmployees=NoOfEmployees;
        employee=new Employee[NoOfEmployees];
    }
    /*
      We need to pass Object reference variable of Organization to method printEmployeeDetailsAll()
      so that we can iterate all the employees of Organization class.
     */
    public void printEmployeeDetailsAll(Organization PodTest)
    {
        for(Employee e:PodTest.employee)
        {
            System.out.println("Name :"+e.name+" "+"Employee id "+e.empID+"  "+"Age is "+e.age);

        }

    }


}
