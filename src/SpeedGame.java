public class SpeedGame {

    public static void main(String[] args) {
        boolean isGreenLight = true;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int numbersOfPlayers = 0;

        if (isGreenLight == true) {

            System.out.println("Выбывших: " + numbersOfPlayers);
        } else {
            if (speedOfPlayer1 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            if (speedOfPlayer2 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            if (speedOfPlayer3 > 0) {
                numbersOfPlayers = numbersOfPlayers + 1;
            }
            System.out.println("Выбывших: " + numbersOfPlayers);
        }
    }
    
}
