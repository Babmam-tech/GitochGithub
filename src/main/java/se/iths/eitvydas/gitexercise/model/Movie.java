package se.iths.eitvydas.gitexercise.model;

public class Movie {

    String title = "Ted";
    int releaseYear = 2012;

    @Override
    public String toString() {
        return title + " Released: " + releaseYear;
    }
}
