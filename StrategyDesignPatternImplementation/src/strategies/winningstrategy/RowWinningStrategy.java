package strategies.winningstrategy;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public void checkWinner() {
        System.out.println("Row winning strategy");
    }
}
