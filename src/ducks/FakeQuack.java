package ducks;

import duck_behavior.QuackBehavior;

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}
