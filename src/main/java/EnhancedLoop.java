public class EnhancedLoop {
    public static void main(String[] args) {
//        for(int i=0;i<=10;i++)
//        {
//            System.out.println(i);
//        }
        String names[]=new String[]{"Akhil","Atul","Atif"};
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("****************************");
        // Enhanced for loop
        for(String name:names)
        {
            System.out.println(name);
        }
        System.out.println("****************************");
        //integer array
        int empid[]={1,2,3,4,5,6};
        for(int i:empid)
        {
            System.out.println(i);
        }
    }
}
