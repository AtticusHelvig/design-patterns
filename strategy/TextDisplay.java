package strategyPattern;

public class TextDisplay implements DisplayStrat {

    @Override
    public void display() {

        System.out.println("I am a duck!!");
    }

}
