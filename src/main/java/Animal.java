public class Animal implements Acting, Comparable<Animal> {
//    name, type, age, weight
    private final String name;
    private final AnimalType type;
    private final int age;

    public Animal(String name, AnimalType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void doAct() {
        final String action;
        switch (type) {
            case TIGER:
                action = "bijt >:(";
                break;
            case GORILLA:
                action = "gooit met poep :(";
                break;
            case OSTRICH:
                action = "rent weg!";
                break;
            default:
                throw new IllegalArgumentException("UNREACHABLE CODE");
        }

        System.out.println(name + " (" + age + ") " + action);
    }

    @Override
    public int compareTo(Animal that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
