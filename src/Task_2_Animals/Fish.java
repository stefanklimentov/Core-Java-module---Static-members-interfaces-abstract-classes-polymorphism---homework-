package Task_2_Animals;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }

    @Override
    void reactToPetting() {
        System.out.println(getName() + " swims away very fast ");
    }
}

class FlyingFish extends Fish {

    public FlyingFish(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(getName() + " is jumping out of the water ");
    }
}