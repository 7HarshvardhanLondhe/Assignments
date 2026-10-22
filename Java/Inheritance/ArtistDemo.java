
class Artist {
    protected String name;
    protected int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Painter extends Artist {
    private String paintingStyle, mediumUsed;
    private int numberOfPaintings;

    Painter(String name, int age, String style,
            String medium, int paintings) {
        super(name, age);
        paintingStyle = style;
        mediumUsed = medium;
        numberOfPaintings = paintings;
    }

    void display() {
        super.display();
        System.out.println("Style: " + paintingStyle);
        System.out.println("Medium: " + mediumUsed);
        System.out.println("Paintings: " + numberOfPaintings);
    }
}

class Musician extends Artist {
    private String instrument, musicGenre;
    private int numberOfAlbums;

    Musician(String name, int age, String instrument,
             String genre, int albums) {
        super(name, age);
        this.instrument = instrument;
        musicGenre = genre;
        numberOfAlbums = albums;
    }

    void display() {
        super.display();
        System.out.println("Instrument: " + instrument);
        System.out.println("Genre: " + musicGenre);
        System.out.println("Albums: " + numberOfAlbums);
    }
}

class Actor extends Artist {
    private String filmIndustry;
    private int numberOfMovies;

    Actor(String name, int age, String industry, int movies) {
        super(name, age);
        filmIndustry = industry;
        numberOfMovies = movies;
    }

    void display() {
        super.display();
        System.out.println("Industry: " + filmIndustry);
        System.out.println("Movies: " + numberOfMovies);
    }
}

public class ArtistDemo {
    public static void main(String[] args) {
        Painter p = new Painter("Rahul", 30, "Abstract", "Oil", 50);
        Musician m = new Musician("Amit", 28, "Guitar", "Rock", 5);
        Actor a = new Actor("Priya", 32, "Bollywood", 20);

        System.out.println("Painter:");
        p.display();

        System.out.println("\nMusician:");
        m.display();

        System.out.println("\nActor:");
        a.display();
    }
}
