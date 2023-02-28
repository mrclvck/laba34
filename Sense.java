public abstract class Sense {
    private String name;

    public abstract void wasVisible(String place, String object);
    public String getName() {
        return name;
    }
    public Sense(String name) {
        this.name = name;
    }
}
