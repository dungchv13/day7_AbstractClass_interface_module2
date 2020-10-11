import animals.Animals;
import animals.Chicken;
import animals.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animals a: animals){
            System.out.println(a.makeSound());

            if(a instanceof Chicken){
                System.out.println(((Chicken) a).howToEat());
            }
        }

    }
}
