package turtle;

public class Main {
    public static void main(String[] args) {
        float[] commands = {2, 5.12F, 3, 5.12F, 3, 5.12F, 3, 5.12F, 1, 6, 9};
        Turtle turtle = new Turtle();

        turtle.display(commands);
    }
}
