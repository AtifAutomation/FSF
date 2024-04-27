package pkg1;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Human {
    public static void main(String[] args) {
        Animal obj2=new Animal();
        obj2.name="Akash";
        System.out.println(obj2.name);
        //obj2.age=20;
        //'age' has private access in 'pkg1.Animal'
        obj2.gender="Male";
        System.out.println(obj2.gender);
        obj2.id=21;
        System.out.println(obj2.id);

    }

}
