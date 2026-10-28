package se.iths.eitvydas.gitexercise;

public class City {

    String name = "Stockholm";
    String population = "en miljon";

    @Override
    public String toString() {
        return name + " av " + population;
    }

}
