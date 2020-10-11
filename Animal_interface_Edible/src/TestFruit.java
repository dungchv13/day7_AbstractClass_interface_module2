import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for(Fruit f: fruit){
            System.out.println(f.howToEat());
        }
    }
}
