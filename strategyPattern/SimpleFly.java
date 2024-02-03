package strategyPattern;

public class SimpleFly implements FlyStrat {

    @Override
    public void fly() {
        System.out.println("flap");
    }

}
