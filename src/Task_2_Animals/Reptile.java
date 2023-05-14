package Task_2_Animals;

//клас влечуги
public class Reptile extends Animal {

    public Reptile(String nane) {
        super(nane);
    }

    @Override
    void reactToPetting() {
        System.out.println(getName() + " makes a threatening sound ");
    }

    public void swim() {
        System.out.println(getName() + " is swimming ");
    }

    public static class MonitorLizard {
    }
}

// клас варани
class MonitorLizard extends Reptile {
    public MonitorLizard(String name) {
        super(name);
    }
}

// клас кобри
class Cobra extends Reptile {
    public Cobra(String name) {
        super(name);
    }
}