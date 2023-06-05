package turtle;

public class Turtle {
    private static int way = 0; // 0 = up   1 = right 2 = down 3 = left
    private static boolean pen = false; // 0 down  -- 1 up
    private static int turtleX = 0, turtleY = 0;
    private static int[][] floor = new int[20][20];

    public void display(float[] commands) {
        for (float command : commands) {
            switch ((int) command) {
                case 1 -> {
                    pen = true;
                }
                case 2 -> {
                    pen = false;
                }
                case 3 -> {
                    way++;
                }
                case 4 -> {
                    way--;
                }
                case 5 -> {
                    int steps = Math.round((command - 5) * 100);
                    switch (way) {


                        case 0 -> {
                            for (int i = turtleY; steps > 0; i++, steps--) {
                                if (!pen) {
                                    floor[turtleX][i] = 1;
                                }
                                turtleY = i;
                            }
                        }
                        case 1 -> {

                            for (int i = turtleX; steps > 0; i++, steps--) {
                                if (!pen) {
                                    floor[i][turtleY] = 1;
                                }
                                turtleX = i;
                            }
                        }
                        case 2 -> {
                            for (int i = turtleY; steps > 0; i--, steps--) {
                                if (!pen) {
                                    floor[turtleX][i] = 1;
                                }
                                turtleY = i;
                            }
                        }

                        case 3 -> {

                            for (int i = turtleX; steps > 0; i--, steps--) {
                                if (!pen) {
                                    floor[i][turtleY] = 1;
                                }
                                turtleX = i;
                            }
                        }
                    }
                }
                case 6 -> {
                    for (int[] ints : floor) {
                        for (int anInt : ints) {
                            switch (anInt) {
                                case 0 -> {
                                    System.out.print("   ");
                                    break;
                                }
                                case 1 -> {
                                    System.out.print("*  ");
                                    break;
                                }
                            }
                        }
                        System.out.println();
                    }
                }
                case 9 -> {
                    break;
                }
            }
        }


    }
}
