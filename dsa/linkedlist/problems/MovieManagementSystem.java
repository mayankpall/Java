package com.bridgelabz.dsa.linkedlist.problems;

class Movie {
    String movieTitle;
    String director;
    int yearOfRelease;
    int rating;

    Movie(String movieTitle, String director, int yearOfRelease, int rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    void displayDetails() {
        System.out.println("\nMovie Details:");
        System.out.println("Title     : " + movieTitle);
        System.out.println("Director  : " + director);
        System.out.println("Year      : " + yearOfRelease);
        System.out.println("Rating    : " + rating);
    }
}

class MovieNode {
    Movie movie;
    MovieNode next;
    MovieNode previous;

    MovieNode(Movie movie) {
        this.movie = movie;
        this.next = null;
        this.previous = null;
    }
}

public class MovieManagementSystem {
    private MovieNode head;
    private MovieNode tail; // Helps for O(1) insertion at the end

    public void addAtBeginning(Movie movie) {
        MovieNode newNode = new MovieNode(movie);
        if (head == null) {
            head = tail = newNode; // First node, both head and tail point to it
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        System.out.println("Movie added at the beginning.");
    }

    public void addAtEnd(Movie movie) {
        if (head == null) {
            addAtBeginning(movie);
            return;
        }
        MovieNode newNode = new MovieNode(movie);
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode; // Update tail
        System.out.println("Movie added at the end.");
    }

    public void atSpecificPosition(int position, Movie movie) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addAtBeginning(movie);
            return;
        }

        MovieNode current = head;
        int count = 1;

        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // If position is beyond the list size, add at the end
        if (current.next == null) {
            addAtEnd(movie);
            return;
        }

        MovieNode newNode = new MovieNode(movie);
        newNode.next = current.next;
        newNode.previous = current;
        current.next.previous = newNode;
        current.next = newNode;

        System.out.println("Movie added at position " + position);
    }

    public void removeMovie(String title) {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = head;

        // Removing head
        if (current.movie.movieTitle.equals(title)) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null; // If the list is empty
            }
            System.out.println("Movie removed: " + title);
            return;
        }

        while (current != null && !current.movie.movieTitle.equals(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found: " + title);
            return;
        }

        // Removing tail
        if (current == tail) {
            tail = tail.previous;
            tail.next = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

        System.out.println("Movie removed: " + title);
    }

    public void searchMovieByDirector(String director) {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.movie.director.equalsIgnoreCase(director)) {
                current.movie.displayDetails();
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movie found directed by: " + director);
        }
    }

    public void searchMovieByRating(int rating) {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = head;
        boolean found = false;

        while (current != null) {
            if (current.movie.rating == rating) {
                current.movie.displayDetails();
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    public void displayMoviesForward() {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = head;
        System.out.println("\nMovies (Forward Order):");
        while (current != null) {
            current.movie.displayDetails();
            current = current.next;
        }
    }

    public void displayMoviesBackward() {
        if (tail == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (current != null) {
            current.movie.displayDetails();
            current = current.previous;
        }
    }

    public void updateMovieRating(String title, int newRating) {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode current = head;
        while (current != null) {
            if (current.movie.movieTitle.equalsIgnoreCase(title)) {
                current.movie.rating = newRating;
                System.out.println("Updated rating for '" + title + "' to " + newRating);
                return;
            }
            current = current.next;
        }

        System.out.println("Movie not found: " + title);
    }

    public static void main(String[] args) {
        MovieManagementSystem pvr = new MovieManagementSystem();

        // Sample Movies
        Movie m1 = new Movie("you", "joe ", 2010, 5);
        Movie m2 = new Movie("Interstellar", "Nolan", 2014, 5);
        Movie m3 = new Movie("tiger", "salman", 1997, 4);
        Movie m4 = new Movie("why", "James Cameron", 2009, 5);

        // Add movies
        pvr.addAtBeginning(m1);
        pvr.addAtEnd(m2);
        pvr.atSpecificPosition(2, m3);
        pvr.addAtEnd(m4);

        // Display movies
        pvr.displayMoviesForward();
        pvr.displayMoviesBackward();

        // Search movies
        pvr.searchMovieByDirector("James Cameron");
        pvr.searchMovieByRating(5);

        // Update rating
        pvr.updateMovieRating("tiger", 3);
        pvr.displayMoviesForward();

        // Remove movie
        pvr.removeMovie("why");
        pvr.displayMoviesForward();
    }
}
