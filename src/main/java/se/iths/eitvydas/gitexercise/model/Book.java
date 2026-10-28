package se.iths.eitvydas.gitexercise.model;

public class Book {

    String title = "Shrek";
    String author = "William Steig";

    @Override
    public String toString() {
        return title + " av " + author;
    }

}
