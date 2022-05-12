package solution;

/** From the book : Java 1.4 Game programming.
 *  Represents an Alien, a subclass of Creature.
 *  Overrides speak() method to say: Alien from planet <nameOfPlanet> says <greeting>
 *  where the greeting is from the parent's class Creature.
 *  Has a fight() method that is not in the parent class.
 *
 *  */
public class Alien extends Creature{ // FILL IN CODE: Alien should be a subclass of Creature
    private String planet; // the name of the planet where the alien lives
    private static int numAliensFromMars = 0; // the number of aliens from Mars

    public Alien(String greeting, String planet) {
        super(greeting);
        this.planet = planet;
        if (planet.equals("Mars"))
            numAliensFromMars++;
    }

    // Override the speak method so that the alien says:
    // Alien from such and such planet says greeting
    @Override
    public void speak() {
        System.out.println("Alien from " + planet + " says " + getGreeting());
    }

    public void fight() {
        if (planet.equals("Mars") && numAliensFromMars > 3)
            System.out.println("Let's fight!");
    }

}
