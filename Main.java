// Name - Nimit Prakash
//Prn - 23070126082
// AIML B (B1)

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();

        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        decoy.swim();

        System.out.println("\nTesting behavior change at runtime:");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
