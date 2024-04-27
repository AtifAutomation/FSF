public class TablePrintingClass {
    String name;
    String gender;
    String location;
    public TablePrintingClass(String name,String gender,String location)
    {
        this.name=name;
        this.gender=gender;
        this.location=location;

    }
    public void getDetails()
    {
        System.out.println(name+" "+gender+" "+" "+location);
    }


}
