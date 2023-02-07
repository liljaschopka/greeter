package is.hi.lks17.hbv202g.ass3.frontend;

import src.is.hi.lks17.hbv202g.ass3.backend.Greeter;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setEnglish();
        System.out.println(greeter.greet());
        greeter.setGerman();
        System.out.println(greeter.greet());
    }

}
