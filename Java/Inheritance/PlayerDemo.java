
class Player {
    protected String name, country;
    protected int age, matchesPlayed, jerseyNumber;

    Player(String name, int age, String country,
           int matchesPlayed, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Matches: " + matchesPlayed);
        System.out.println("Jersey Number: " + jerseyNumber);
    }
}

class CricketPlayer extends Player {
    private int totalRuns, totalWickets;
    private String battingStyle, bowlingStyle;

    CricketPlayer(String name, int age, String country,
                  int matches, int jersey, int runs, int wickets,
                  String batting, String bowling) {
        super(name, age, country, matches, jersey);
        totalRuns = runs;
        totalWickets = wickets;
        battingStyle = batting;
        bowlingStyle = bowling;
    }

    void display() {
        super.display();
        System.out.println("Runs: " + totalRuns);
        System.out.println("Wickets: " + totalWickets);
        System.out.println("Batting: " + battingStyle);
        System.out.println("Bowling: " + bowlingStyle);
    }
}

class FootballPlayer extends Player {
    private int totalGoals;
    private String playingPosition;

    FootballPlayer(String name, int age, String country,
                   int matches, int jersey, int goals,
                   String position) {
        super(name, age, country, matches, jersey);
        totalGoals = goals;
        playingPosition = position;
    }

    void display() {
        super.display();
        System.out.println("Goals: " + totalGoals);
        System.out.println("Position: " + playingPosition);
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        CricketPlayer c = new CricketPlayer(
            "MS Dhoni", 45, "India", 350, 7,
            10773, 1, "Right Handed", "Right Arm Medium"
        );

        FootballPlayer f = new FootballPlayer(
            "Messi", 39, "Argentina", 190, 10,
            112, "Forward"
        );

        System.out.println("Cricket Player:");
        c.display();

        System.out.println("\nFootball Player:");
        f.display();
    }
}
