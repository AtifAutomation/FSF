public class AppDemo {
    public static void main(String[] args) {
        /*
          In Organization class no of employees variable is present hence while creating the instance we can pass the number of employees of that organization.

         */
        // Q2 : Create 1 organization Podtest and create 5 active employees in it.
        //Use Constructor in Employee class to assign values to the instance variable
        Organization PodTest=new Organization(5);
        Employee emp[]=new Employee[PodTest.NoOfEmployees];
        emp[0]=new Employee("Akash",20,40000,001,true);
        emp[1]=new Employee("Rakesh",21,145000,002,true);
        emp[2]=new Employee("Rahim",34,36000,003,true);
        emp[3]=new Employee("Jade",28,100001,004,true);
        emp[4]=new Employee("Baker",18,15000,005,true);
        PodTest.employee=emp;
        //Create admin as "Rohan"
        Admin role=new Admin("Rohan");

        PodTest.printEmployeeDetailsAll(PodTest);
        role.printTaxAmountPerEmployees(PodTest);
        System.out.println("Tax collected :"+role.getTotalTaxCollected(PodTest));





    }
}
