package Task_2_Animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //метод за движение на всички животни
    void move() {
        System.out.println(name + "is moving");
    }

    //метод за хранене на всички животни
    void eat() {
        System.out.println(name + "is eating");
    }

    // Всички животни могат да бъдат погалени
    public void pet() {
        System.out.println(name + " is being petted");
    }

    // абстрактен метод за реакция при галене на всички животни
    abstract void reactToPetting();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

