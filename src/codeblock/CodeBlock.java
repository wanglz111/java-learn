package src.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie = new Movie("123");
        System.out.println(movie.getName());
    }
}

class Movie {
    private String name;
    private String director;
    private double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    {
        System.out.println("Movie init");
        System.out.println("Movie before");
    }

    public Movie(String name, String director, double price) {
        this.name = name;
        this.director = director;
        this.price = price;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
        this.name = name;
    }

}
