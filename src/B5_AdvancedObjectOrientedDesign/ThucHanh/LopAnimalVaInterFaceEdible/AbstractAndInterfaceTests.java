package B5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterFaceEdible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                edible chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
            if (animal instanceof Tiger) {
                edible tiger = (Tiger) animal;
                System.out.println(tiger.howToEat());
            }
        }
    }
}
