import strategies.winningstrategy.RowWinningStrategy;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new RowWinningStrategy());
        game.play();
    }
}