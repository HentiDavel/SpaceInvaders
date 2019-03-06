public class Player {
    double xPos = 400;
    double yPos = 100;
    double velocity = 1;
    double radius = 8.0;

    public Player() {
    }

    public Player(double xPos) {
        this.xPos = xPos;
    }

    public void drawPlayer(){
        StdDraw.filledCircle(xPos, yPos, radius);
    }

    public void moveRight(){
        if (xPos<(800-radius))
            xPos += velocity;
    }
}
