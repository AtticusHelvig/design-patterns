package strategyPattern;

public class QuietQuack implements QuackStrat {

    @Override
    public void quack() {

        System.out.println("quack");
    }

}
