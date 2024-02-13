package strategyPattern;

public class StrategyPatternMain {

    public static void main(String[] args) {

        Duck averageDuck = new Duck(new QuietQuack(), new SimpleFly(), new TextDisplay());
        averageDuck.quack();
        averageDuck.fly();
        averageDuck.display();

        System.out.println();

        Duck annoyingDuck = new Duck(new LoudQuack(), new SimpleFly(), new TextDisplay());
        annoyingDuck.quack();
        annoyingDuck.fly();
        annoyingDuck.display();

        System.out.println();

        Duck anxiousDuck = new Duck(new QuietQuack(), new SimpleFly(), new InquisitiveDisplay());
        anxiousDuck.quack();
        anxiousDuck.fly();
        anxiousDuck.display();
    }
}
