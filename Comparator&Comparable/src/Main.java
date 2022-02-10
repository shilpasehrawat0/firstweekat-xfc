import java.util.ArrayList;

class Movie implements Comparable<Movie>
{
  private double rating;
  private String name;
  private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year-o.year;
    }

    public Movie(String name, Double rating , int year)
    {
        this.name=name;
        this.rating=rating;
        this.year=year;
    }

    public double getRating;
    public String getName;
    public int  getYear;
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> list= new ArrayList<Movie>();
        list.add(new Movie("Sharks",2.0,1996));
        for (Movie movie:list
             ) {
            System.out.println(movie.getName +" "+ movie.getRating+ " " + movie.getYear);
        }

    }
}
