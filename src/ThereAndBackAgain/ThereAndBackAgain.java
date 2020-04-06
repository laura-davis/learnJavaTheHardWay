package ThereAndBackAgain;

public class ThereAndBackAgain {
    public static void main(String[] args) {
        System.out.println("Here.");
        erebor();
        System.out.println("Back first time.");
        erebor();
        System.out.println("Back second time.");
    }
    public static void erebor() {
        System.out.println("There.");
    }
}
// erebor is a function, not a statement.  Removing the parenthesis stops it from calling the function
// commenting out the function call stops it running