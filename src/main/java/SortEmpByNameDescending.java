import java.util.Comparator;

public class SortEmpByNameDescending implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.name.compareTo(o1.name);
    }
}
