package strategyPattern;

import java.util.Scanner;

public class InquisitiveDisplay implements DisplayStrat {

    @Override
    public void display() {

        Scanner in = new Scanner(System.in);
        System.out.println("Who are you? ");
        String name = in.next();
        System.out.printf("Oh, you're %s.\n", name);
        in.close();
    }

}
