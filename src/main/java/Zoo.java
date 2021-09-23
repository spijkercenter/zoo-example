import java.util.*;

public class Zoo {
    private final List<Visitor> visitors;
    private final List<Animal> animals;

    public Zoo() {
        this.visitors = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulate() {
        List<Acting> all = new ArrayList<>();
        all.addAll(visitors);
        all.addAll(animals);

        Collections.shuffle(all);

        for (Acting acting : all) {
            acting.doAct();
        }
    }

    public Map<AnimalType, Integer> countAnimalsPerType() {
        Map<AnimalType, Integer> result = new HashMap<>();

        for (Animal animal : animals) {
           AnimalType type = animal.getType();
           if (result.containsKey(type)) {
               int count = result.get(type);
               count++;
               result.put(type, count);
           } else {
               result.put(type, 1);
           }
        }

        return result;
    }

    public void sortAndPrintAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void sortAndPrintAnimalsByAge() {
        animals.sort(Comparator.comparing(Animal::getAge));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
