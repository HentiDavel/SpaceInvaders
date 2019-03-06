public class Main {

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(800,600);


        Menu menu = new Menu();
        int gameState = 0; //0 = menu, 1 = playin

        while (true){

            if (gameState == 0){
                menu.drawMenu();
            }

            StdDraw.show();
        }


    }
}
