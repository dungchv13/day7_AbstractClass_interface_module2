package animals;

import edible.Edible;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound(){
        return "o-o-O-O-O";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
