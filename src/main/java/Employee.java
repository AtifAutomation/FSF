public class Employee implements Comparable<Employee>{
    String empId;
    String name;
    private int salary;
    Employee(String empID,String name,int salary)
    {
        this.empId=empID;
        this.name=name;
        this.salary=salary;
    }
    public String getEmpId()
    {
        return this.empId;
    }
    public String getName()
    {
        return this.name;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void allDetails()
    {
        System.out.println(this.name+"   "+this.empId+"   "+this.salary);
    }
    public String toString()
    {
        return this.name+" "+this.empId+" "+this.salary;
    }
    /*

         Sorting based on name ascending order.
        */
    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }

    /*

      Sorting based on salary descending order
     */

    public int compareTo(Employee o)
    {
        if(this.salary==o.salary)
        {
            return 0;
        }
        else if(this.salary<o.salary)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }


}
