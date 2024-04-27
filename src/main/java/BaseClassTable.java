import java.util.ArrayList;
import java.util.List;

public class BaseClassTable {
    public static void main(String[] args) {
        TablePrintingClass emp1=new TablePrintingClass("Akhil","Male","Kolkata");
        TablePrintingClass emp2=new TablePrintingClass("Tom","Male","Delhi");
        TablePrintingClass emp3=new TablePrintingClass("Monica","Female","Chennai");

        List<TablePrintingClass> table=new ArrayList<>();
        table.add(emp1);
        table.add(emp2);
        table.add(emp3);
        for(TablePrintingClass e:table)
        {
            e.getDetails();

        }



    }
}
