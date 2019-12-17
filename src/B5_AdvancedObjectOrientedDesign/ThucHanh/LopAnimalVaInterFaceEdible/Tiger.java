package B5_AdvancedObjectOrientedDesign.ThucHanh.LopAnimalVaInterFaceEdible;

public class Tiger extends Animal implements edible {
    @Override
    public String makeSound() {
        return "Tiger: meww";
    }

    @Override
    public String howToEat() {
        return "choap choep";
    }
}
