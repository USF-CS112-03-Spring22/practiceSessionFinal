package solution;

import java.util.ArrayList;

public class Driver {
        public static void main(String[] args) {
            ArrayList<Creature> creatures = new ArrayList<>();

            // 1) Add 3 aliens and 2 humans to the creatures ArrayList.
            // FILL IN CODE
            Human h1 = new Human("Helen", "Hi");
            Human h2 = new Human("Carlos", "Hola");

            creatures.add(h1);
            creatures.add(h2);

            Alien a1 = new Alien("hello", "Mars");
            Alien a2 = new Alien("hellohello", "Mars");
            Alien a3 = new Alien("hihihi", "Mars");
            creatures.add(a1);
            creatures.add(a2);
            creatures.add(a3);

            // The output will change if you uncomment these two lines:
            // Alien a4 = new Alien("Be brave", "Mars");
            // creatures.add(a4);

            // 2) Iterate over the ArrayList, call speak() method for
            // each creature. Call fight() for each Alien
            for (Creature cr: creatures) {
                cr.speak();
                if (cr instanceof Alien)
                    ((Alien) cr).fight();
            }
        }
}
