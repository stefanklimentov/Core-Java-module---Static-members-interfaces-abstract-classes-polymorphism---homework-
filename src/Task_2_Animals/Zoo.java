package Task_2_Animals;

public class Zoo {

    Animal[] animals;

    Zoo(int maxAnimalsCount) {
        animals = new Animal[maxAnimalsCount];
    }

    boolean addAnimal(Animal a) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = a;
                return true;
            }
        }
        return false;

    }
}
