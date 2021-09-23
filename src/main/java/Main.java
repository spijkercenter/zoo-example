public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Visitor v1 = new Visitor("Berry van de Hooimaer");
        Visitor v2 = new Visitor("John Woo");

        zoo.addVisitor(v1);
        zoo.addVisitor(v2);

        Animal o1 = new Animal("Rennie", AnimalType.OSTRICH, 12);
        Animal o2 = new Animal("Ronnie", AnimalType.OSTRICH, 36);
        Animal g1 = new Animal("Bokito", AnimalType.GORILLA, 35);
        Animal t1 = new Animal("Capn C", AnimalType.TIGER, 5);

        zoo.addAnimal(o1);
        zoo.addAnimal(o2);
        zoo.addAnimal(g1);
        zoo.addAnimal(t1);


        System.out.println(zoo.countAnimalsPerType());
    }
}
