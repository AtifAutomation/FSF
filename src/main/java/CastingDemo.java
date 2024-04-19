public class CastingDemo {
    public static void main(String[] args) {
        Chrome c1=new Chrome();
//        c1.chromeLogic(); // chrome class method
//        c1.browserLogic(); // browser class method
//        System.out.println("*********************************");
//        System.out.println("***Upcasting***");
        /*




         */

        Browser cb1= new Chrome();
        //cb1.browserLogic(); // browser class method
        //cb1.chromeLogic();//Cannot resolve method 'chromeLogic' in 'Browser'
        // cannot access chrome class method
        cb1.browserLogic();
//        System.out.println("***Down casting***");
//        ((Chrome) cb1).browserLogic();
//        ((Chrome) cb1).chromeLogic();

        //Chrome c5=new Browser();

    }
}
