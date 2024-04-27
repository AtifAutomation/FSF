import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TablePrintingUsingCollection {
    public static void main(String[] args) {
        List<String> row1=new ArrayList<String>();
        row1.add("Akash");
        row1.add("Male");
        row1.add("Kolkata");
        List<String> row2=new ArrayList<String>();
        row2.add("Ram");
        row2.add("Male");
        row2.add("Ghaziabad");
        List<String> row3=new ArrayList<String>();
        row3.add("Mansa");
        row3.add("Female");
        row3.add("Lucknow");
        List<String> row4=new ArrayList<String>();
        row4.add("Mandy");
        row4.add("Female");
        row4.add("Delhi");
        List<List<String>> table=new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);
        System.out.println("***************************");
        for(List<String> e:table)
        {
            System.out.println(e.get(0)+" "+e.get(1)+" "+e.get(2));
        }

    }
}
