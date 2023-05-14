package Task_2_Animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    void reactToPetting() {
        System.out.println("Some mammals love to be petted ");
    }

}

// Клас делфин
class Dolphin extends Mammal {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void reactToPetting() {
        System.out.println(getName() + " love to be petted and makes happy sounds");
    }
}

// клас прилепи
class Bat extends Mammal {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void reactToPetting() {
        System.out.println(getName() + " fly away");
    }
}

//клас хора
class Person extends Mammal {
    public Person(String name) {
        super(name);
    }

    @Override
    public void reactToPetting() {
        System.out.println(getName() + " loved to be hugged and kissed ");
    }

    public void petAnimal(Animal animal) {
        System.out.println("Person pets the animal:");
        animal.pet();
    }
}
