package strategyPattern;

/**
 * Duck
 */
public class Duck {

    private QuackStrat quackStrat;
    private FlyStrat flyStrat;
    private DisplayStrat displayStrat;

    public Duck(QuackStrat quackStrat, FlyStrat flyStrat, DisplayStrat displayStrat) {
        this.quackStrat = quackStrat;
        this.flyStrat = flyStrat;
        this.displayStrat = displayStrat;
    }

    public void quack() {
        quackStrat.quack();
    }

    public void fly() {
        flyStrat.fly();
    }

    public void display() {
        displayStrat.display();
    }
}