import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3Q4Q5SortingUsingComparator {
    public static void main(String[] args) {
        List<Employee> empDetails=new ArrayList<>();
        Employee emp1=new Employee("T1","Suraj",97);
        Employee emp2=new Employee("T2","Zen",103);
        Employee emp3=new Employee("T3","Derick",72);
        Employee emp4=new Employee("T4","Piyush",108);
        Employee emp5=new Employee("T5","zen",54);
        empDetails.add(emp1);
        empDetails.add(emp2);
        empDetails.add(emp3);
        empDetails.add(emp4);
        empDetails.add(emp5);
        SortEmpByNameAscending s1=new SortEmpByNameAscending();
        SortEmpByNameDescending s2=new SortEmpByNameDescending();
        SortEmpBySalaryDescending s3=new SortEmpBySalaryDescending();
        Collections.sort(empDetails,s1);
        System.out.println("***Sorting the table by name in ascending order***");
        System.out.println();
        for(Employee e:empDetails)
        {
            System.out.println(e.getEmpId()+"  "+e.getName()+" "+e.getSalary());
        }
        System.out.println("***Sorting the table by name in descending order***");
        System.out.println();
        Collections.sort(empDetails,s2);
        for(Employee e:empDetails)
        {
            System.out.println(e.getEmpId()+"  "+e.getName()+" "+e.getSalary());
        }

        Collections.sort(empDetails,s3);
        System.out.println("***Sorting the table by salary in descending order***");
        System.out.println();
        for(Employee e:empDetails)
        {
            System.out.println(e.getEmpId()+"  "+e.getName()+" "+e.getSalary());
        }



    }
}
