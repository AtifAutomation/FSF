import java.util.HashMap;

public class Q1StoringDataUsingMapWithOutClass {
    public static void main(String[] args) {
        /*
            Declaring a HashMap which will have  employee id (string) as key and value as employee id (string), employee name(string) and salary(int)
        */
        HashMap<String,Object[]> data=new HashMap<>();
        /*
          Declaring a Object array of size 5
         */
        Object ObjectArray[]=new Object[5];
        /*
          Storing data in Object array as employee id (string), employee name(string) and salary(int)
         */
        ObjectArray[0]=new Object[]{"T1","Suraj",97};
        ObjectArray[1]=new Object[]{"T2","zen",103};
        ObjectArray[2]=new Object[]{"T3","Derick",72};
        ObjectArray[3]=new Object[]{"T4","Piyush",108};
        ObjectArray[4]=new Object[]{"T5","zen",54};
        /*
          Storing key and value data in hash map using hash map object reference.
         */
        data.put("T1", (Object[]) ObjectArray[0]);
        data.put("T2", (Object[]) ObjectArray[1]);
        data.put("T3", (Object[]) ObjectArray[2]);
        data.put("T4", (Object[]) ObjectArray[3]);
        data.put("T5", (Object[]) ObjectArray[4]);

        /*
          Printing the data using for each loop in table format
         In hash map values are stored in Object array.
         */
        for(Object[] e:data.values())
        {
            System.out.println(e[0]+" | "+e[1]+" | "+e[2]);
        }








    }






}
