import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int NUMBER_OF_BALLS = 4;
    public static final double DISPLACEMENT_FACTOR = 0.2;
    private int frame = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            drawCircle(frame, i, HEIGHT * DISPLACEMENT_FACTOR * i);
        }

        frame++;
    }

    private void drawCircle(double frame, double speedFactor, double height) {
        float xAxis = (float) (frame * speedFactor);

        ellipse(xAxis, (float) height, DIAMETER, DIAMETER);
    }
}