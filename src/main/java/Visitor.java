public class Visitor implements Acting, Comparable<Visitor> {
    private final String name;

    public Visitor(String name) {
        this.name = name;
    }


    @Override
    public void doAct() {
        System.out.println(name + " doet een koprol!");
    }

    @Override
    public int compareTo(Visitor that) {
        return this.name.compareTo(that.name);
    }
}
