// The Adaptee: Stand class
public abstract class Stand {
    private String name;

    public Stand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void performAbility();
}
