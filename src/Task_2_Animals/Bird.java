package Task_2_Animals;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(String name) {
        super(name);
    }

    @Override
    public void reactToPetting() {
        System.out.println("Some birds do not like to be petted and fly away");
    }
}

// клас хищни птици
class PredatorBird extends Bird {
    public PredatorBird(String name) {
        super(name);
    }

    @Override
    public void reactToPetting() {
        System.out.println("Do not thing to pet a predator bird!!!");
    }
}
// клас пингвини

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Penguin swimming and waddling");
    }

    @Override
    public void reactToPetting() {
        System.out.println("Penguins do not like petting");
    }
}
