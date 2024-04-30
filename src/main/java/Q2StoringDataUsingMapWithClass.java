import java.util.*;

public class Q2StoringDataUsingMapWithClass {
    public static void main(String[] args) {
        /*
          Declaring a HashMap which will have  employee id (string) as key and value as custom employee class
         */
        HashMap<String,Employee> table=new HashMap<String,Employee>();

        /*
         Creating Employee class object reference variable and further Assigning value to instance variable of Employee class using Parameterized Constructor
         while creating object.
         */
        Employee emp1=new Employee("T1","Suraj",97);
        Employee emp2=new Employee("T2","Zen",103);
        Employee emp3=new Employee("T3","Derick",72);
        Employee emp4=new Employee("T4","Piyush",108);
        Employee emp5=new Employee("T5","zen",54);
        /*
          Placing key value as employee id which is accessed through each employee object reference
          and value as each individual employee object reference.
         */
        table.put(emp1.getEmpId(),emp1);
        table.put(emp2.getEmpId(),emp2);
        table.put(emp3.getEmpId(),emp3);
        table.put(emp4.getEmpId(),emp4);
        table.put(emp5.getEmpId(),emp5);

        System.out.println("*****Printing the data*****");
        for(Employee emp:table.values())
        {
            System.out.println(emp.toString());;

        }

//        List<Employee> data=new ArrayList<>();
//        data.add(emp1);
//        data.add(emp2);
//        data.add(emp3);
//        data.add(emp4);
//        data.add(emp5);
//        Collections.sort(data);
//        System.out.println("*****After Sorting*****");
//        for(Employee e:data)
//        {
//            System.out.println(e.toString());
//        }



    }
}
