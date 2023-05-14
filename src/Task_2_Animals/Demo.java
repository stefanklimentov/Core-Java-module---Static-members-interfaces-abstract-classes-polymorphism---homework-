package Task_2_Animals;

public class Demo {
    public static void main(String[] args) {

        Bird bird = new Bird("Kanarche");
        Penguin penguin = new Penguin("Pingvin");
        PredatorBird predatorBird = new PredatorBird("Orel");
        Fish fish = new Fish("Golden Fish");
        FlyingFish flyFish = new FlyingFish("Letiasta riba ");
        Bat bat = new Bat("Prilep");
        Dolphin dolphin = new Dolphin("Um belia delfin");
        Mammal monkey = new Mammal("Maimuna");
        Person p = new Person("Goshko");
        Cobra cobra = new Cobra("Cobra");
        MonitorLizard lizard = new MonitorLizard("Varan");
        Reptile reptile = new Reptile("Guster");

        Zoo z = new Zoo(11);
        z.addAnimal(penguin);
        z.addAnimal(predatorBird);
        z.addAnimal(fish);
        z.addAnimal(flyFish);
        z.addAnimal(bat);
        z.addAnimal(dolphin);
        z.addAnimal(monkey);
        z.addAnimal(cobra);
        z.addAnimal(lizard);
        z.addAnimal(reptile);

        for (Animal animal : z.animals) {
            if (animal != null) {
                System.out.println();
                p.petAnimal(animal);
                animal.reactToPetting();

            }
        }
    }
}