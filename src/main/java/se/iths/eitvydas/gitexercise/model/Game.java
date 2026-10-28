package se.iths.eitvydas.gitexercise.model;

public class Game {

    String title = "Call of Duty";
    int ageLimit = 18;

    @Override
    public String toString() {
        return title + " Rated Age: " + ageLimit;
    }
}
