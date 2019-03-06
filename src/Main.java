public class Main {

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(800,600);
        StdDraw.clear(StdDraw.BLACK);

        Menu menu = new Menu();
        int gameState = 0; //0 = menu, 1 = playing

        while (true){

            if(StdDraw.isKeyPressed('Q')){
                System.exit(0);
            }

            if (gameState == 0){
                menu.drawMenu();

                if (StdDraw.isKeyPressed(' ')){
                    gameState = 1;
                }

                if(StdDraw.isMousePressed() && StdDraw.mouseX() > 0.4 && StdDraw.mouseX() < 0.6 && StdDraw.mouseY() > 0.4 && StdDraw.mouseX() < 0.6){
                    gameState = 1;
                }

            }

            if (gameState == 1){




            }

            StdDraw.show();
        }


    }
}
