package strategyPattern;

public class LoudQuack implements QuackStrat {

    @Override
    public void quack() {

        System.out.println("QUACK!");
    }

}
