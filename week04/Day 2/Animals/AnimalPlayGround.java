package Animals;

public class AnimalPlayGround {
    public static void main(String[] args) {
        Animal fox = new Animal();
        Animal bunny = new Animal();
        Animal sheep = new Animal();

        System.out.println("Level of hunger of fox: " + fox.hunger);
        fox.eat();
        System.out.println("After eat: " + fox.hunger);
    }
}
