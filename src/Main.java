public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        init();
        new Main().init();
    }


    private int playersTurn = 0; // 0 = Player 1, 1 = Player 2
    private int[][] tttField = new int[3][3];

    /**
     * Initialize
     *
     */
    public void init() {
        playersTurn = 0;
        tttField = new int[3][3];

        System.out.println("Success");

//        tttField[0][0] = 5;
//        tttField[2][2] = 2;

        System.out.println(tttField[0][0]);
        System.out.println(tttField[2][2]);
        for (int i = 0; i < tttField.length; i++) {
            for (int j = 0; j < tttField.length; j++) {
                System.out.println(tttField[i][j]);
            }
        }
    }


    public void test() {
        //string s = "b";
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + 1);
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + 1);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(input);
    }
}
