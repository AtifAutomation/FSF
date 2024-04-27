public class BoxingConcept {
    public static void main(String[] args) {
        //Boxing PD---->Object
        int i=5;
        char c='d';
        Integer num=Integer.valueOf(i);
        Character ch=Character.valueOf('d');
        System.out.println(num);
        System.out.println(ch);
        //unboxing Object---->PD
        int num1=num.intValue();
        System.out.println(num1);
        //Autoboxing Automatically PD--->Object
        Integer n=5;
        //Boxing will be done automatically
        System.out.println(n);


    }
}
