public class Demo {
    public static void main(String[] args) {
        Animal lion=new Animal("Lion");
        Animal tiger=new Animal("Tiger");
        Animal cat=new Animal("Cat");

        Animal anml[]=new Animal[]{lion,tiger,cat};
        for(Animal anm:anml)
        {
            System.out.println(anm.name);
            anm.printDetails();
        }

    }
}
