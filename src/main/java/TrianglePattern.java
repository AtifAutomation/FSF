public class TrianglePattern {

    public static void main(String[] args) {
        for(int rows=0;rows<=5;rows++)
        {
            for(int space=1;space<=5-rows;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=rows*2-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
