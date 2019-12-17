package B5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterFaceEdible;

public class Chicken extends Animal implements edible
{
    @Override
    public String makeSound() {
        return "Chicken : Ò Ó O O... mew";
    }

    @Override
    public String howToEat() {
        return "nhoam nhoam";
    }
}
