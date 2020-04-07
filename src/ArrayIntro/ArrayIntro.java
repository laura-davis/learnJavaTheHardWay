package ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};

        String[] colours = {"RED", "YELLOW", "PINK", "GREEN", "ORANGE", "PURPLE", "BLUE"};
        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }

        System.out.println();

        for (String c : colours) {
            System.out.println(c.toLowerCase());
        }
    }
}
